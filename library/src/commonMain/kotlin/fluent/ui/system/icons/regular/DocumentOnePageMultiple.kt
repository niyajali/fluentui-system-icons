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

public val FluentIcons.Regular.DocumentOnePageMultiple: ImageVector
    get() {
        if (_DocumentOnePageMultiple != null) {
            return _DocumentOnePageMultiple!!
        }
        _DocumentOnePageMultiple = ImageVector.Builder(
            name = "Regular.DocumentOnePageMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7.747f, 5.5f)
                curveTo(7.334f, 5.5f, 7f, 5.836f, 7f, 6.25f)
                curveTo(7f, 6.664f, 7.334f, 7f, 7.747f, 7f)
                horizontalLineTo(13.753f)
                curveTo(14.166f, 7f, 14.5f, 6.664f, 14.5f, 6.25f)
                curveTo(14.5f, 5.836f, 14.166f, 5.5f, 13.753f, 5.5f)
                horizontalLineTo(7.747f)
                close()
                moveTo(7f, 15.25f)
                curveTo(7f, 14.836f, 7.334f, 14.5f, 7.747f, 14.5f)
                horizontalLineTo(13.753f)
                curveTo(14.166f, 14.5f, 14.5f, 14.836f, 14.5f, 15.25f)
                curveTo(14.5f, 15.664f, 14.166f, 16f, 13.753f, 16f)
                horizontalLineTo(7.747f)
                curveTo(7.334f, 16f, 7f, 15.664f, 7f, 15.25f)
                close()
                moveTo(7.747f, 10f)
                curveTo(7.334f, 10f, 7f, 10.336f, 7f, 10.75f)
                curveTo(7f, 11.164f, 7.334f, 11.5f, 7.747f, 11.5f)
                horizontalLineTo(13.753f)
                curveTo(14.166f, 11.5f, 14.5f, 11.164f, 14.5f, 10.75f)
                curveTo(14.5f, 10.336f, 14.166f, 10f, 13.753f, 10f)
                horizontalLineTo(7.747f)
                close()
                moveTo(6.25f, 2f)
                curveTo(5.007f, 2f, 4f, 3.007f, 4f, 4.25f)
                verticalLineTo(17.25f)
                curveTo(4f, 18.493f, 5.007f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(15.25f)
                curveTo(16.493f, 19.5f, 17.5f, 18.493f, 17.5f, 17.25f)
                lineTo(17.5f, 4.25f)
                curveTo(17.5f, 3.007f, 16.493f, 2f, 15.25f, 2f)
                horizontalLineTo(6.25f)
                close()
                moveTo(5.5f, 4.25f)
                curveTo(5.5f, 4.224f, 5.501f, 4.199f, 5.504f, 4.173f)
                curveTo(5.542f, 3.795f, 5.862f, 3.5f, 6.25f, 3.5f)
                lineTo(15.25f, 3.5f)
                curveTo(15.664f, 3.5f, 16f, 3.836f, 16f, 4.25f)
                lineTo(16f, 17.25f)
                curveTo(16f, 17.664f, 15.664f, 18f, 15.25f, 18f)
                horizontalLineTo(6.25f)
                curveTo(5.836f, 18f, 5.5f, 17.664f, 5.5f, 17.25f)
                verticalLineTo(4.25f)
                close()
                moveTo(6.629f, 20.5f)
                curveTo(6.938f, 21.374f, 7.771f, 22f, 8.751f, 22f)
                horizontalLineTo(15.251f)
                curveTo(17.874f, 22f, 20.001f, 19.873f, 20.001f, 17.25f)
                verticalLineTo(11.369f)
                curveTo(20.001f, 11.348f, 20.001f, 11.327f, 20f, 11.306f)
                verticalLineTo(6.75f)
                curveTo(20f, 5.77f, 19.374f, 4.937f, 18.5f, 4.628f)
                lineTo(18.501f, 17.25f)
                curveTo(18.501f, 19.045f, 17.046f, 20.5f, 15.251f, 20.5f)
                horizontalLineTo(6.629f)
                close()
            }
        }.build()

        return _DocumentOnePageMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentOnePageMultiple: ImageVector? = null

@Preview
@Composable
private fun DocumentOnePageMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DocumentOnePageMultiple, contentDescription = null)
    }
}
