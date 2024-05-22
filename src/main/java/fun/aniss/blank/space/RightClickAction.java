package fun.aniss.blank.space;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.application.Application;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.SelectionModel;
import com.intellij.openapi.project.Project;
import fun.aniss.blank.space.utils.RegexExpressionUtils;
import fun.aniss.blank.space.utils.TransitionUtils;
import org.apache.commons.lang.StringUtils;

/**
 * blank-space
 *
 * @author weiyingjie
 * @date 2024-05-22 17:17
 * @since 0.1
 **/
public class RightClickAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        Application application = ApplicationManager.getApplication();
        application.runWriteAction(() -> {
            Project project = e.getProject();
            if (project != null) {
                doAction(e);
            }
        });
    }

    static void doAction(AnActionEvent e) {
        Editor editor = e.getData(PlatformDataKeys.EDITOR);
        if (null == editor) {
            return;
        }
        SelectionModel selectionModel = editor.getSelectionModel();
        String selectedText = selectionModel.getSelectedText();
        if (StringUtils.isBlank(selectedText)) {
            return;
        }

        Runnable runnable = () -> editor.getDocument().replaceString(selectionModel.getSelectionStart(), selectionModel.getSelectionEnd(), TransitionUtils.spacingText(RegexExpressionUtils.replace(selectedText, "\\f|\\r|\\t", "")));

        WriteCommandAction.runWriteCommandAction(e.getData(PlatformDataKeys.PROJECT), runnable);
    }
}
