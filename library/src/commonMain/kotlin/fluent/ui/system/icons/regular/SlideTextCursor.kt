package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.SlideTextCursor: ImageVector
    get() {
        if (_SlideTextCursor != null) {
            return _SlideTextCursor!!
        }
        _SlideTextCursor = ImageVector.Builder(
            name = "Regular.SlideTextCursor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.75f, 8f)
                curveTo(6.336f, 8f, 6f, 8.336f, 6f, 8.75f)
                curveTo(6f, 9.164f, 6.336f, 9.5f, 6.75f, 9.5f)
                horizontalLineTo(10.25f)
                curveTo(10.664f, 9.5f, 11f, 9.164f, 11f, 8.75f)
                curveTo(11f, 8.336f, 10.664f, 8f, 10.25f, 8f)
                horizontalLineTo(6.75f)
                close()
                moveTo(6f, 11.75f)
                curveTo(6f, 11.336f, 6.336f, 11f, 6.75f, 11f)
                horizontalLineTo(14.174f)
                curveTo(14.065f, 11.229f, 14.005f, 11.484f, 14.005f, 11.749f)
                lineTo(14.004f, 12.5f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 12.5f, 6f, 12.164f, 6f, 11.75f)
                close()
                moveTo(20.5f, 6.75f)
                verticalLineTo(14.399f)
                lineTo(22f, 16.062f)
                verticalLineTo(6.75f)
                curveTo(22f, 5.231f, 20.769f, 4f, 19.25f, 4f)
                horizontalLineTo(4.75f)
                curveTo(3.231f, 4f, 2f, 5.231f, 2f, 6.75f)
                verticalLineTo(17.25f)
                curveTo(2f, 18.769f, 3.231f, 20f, 4.75f, 20f)
                horizontalLineTo(14.001f)
                lineTo(14.001f, 18.5f)
                horizontalLineTo(4.75f)
                curveTo(4.06f, 18.5f, 3.5f, 17.94f, 3.5f, 17.25f)
                verticalLineTo(6.75f)
                curveTo(3.5f, 6.06f, 4.06f, 5.5f, 4.75f, 5.5f)
                horizontalLineTo(19.25f)
                curveTo(19.94f, 5.5f, 20.5f, 6.06f, 20.5f, 6.75f)
                close()
                moveTo(6.75f, 14f)
                curveTo(6.336f, 14f, 6f, 14.336f, 6f, 14.75f)
                curveTo(6f, 15.164f, 6.336f, 15.5f, 6.75f, 15.5f)
                horizontalLineTo(12.25f)
                curveTo(12.664f, 15.5f, 13f, 15.164f, 13f, 14.75f)
                curveTo(13f, 14.336f, 12.664f, 14f, 12.25f, 14f)
                horizontalLineTo(6.75f)
                close()
                moveTo(15.486f, 11.05f)
                curveTo(15.776f, 10.939f, 16.104f, 11.017f, 16.312f, 11.248f)
                lineTo(22.677f, 18.305f)
                curveTo(22.897f, 18.55f, 22.932f, 18.91f, 22.763f, 19.193f)
                curveTo(22.593f, 19.476f, 22.259f, 19.615f, 21.939f, 19.535f)
                lineTo(18.402f, 18.657f)
                lineTo(16.372f, 21.671f)
                curveTo(16.188f, 21.945f, 15.846f, 22.066f, 15.531f, 21.97f)
                curveTo(15.215f, 21.873f, 15f, 21.582f, 15f, 21.252f)
                lineTo(15.005f, 11.75f)
                curveTo(15.005f, 11.439f, 15.196f, 11.161f, 15.486f, 11.05f)
                close()
            }
        }.build()

        return _SlideTextCursor!!
    }

@Suppress("ObjectPropertyName")
private var _SlideTextCursor: ImageVector? = null

@Preview
@Composable
private fun SlideTextCursorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SlideTextCursor, contentDescription = null)
    }
}
