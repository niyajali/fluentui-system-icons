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

public val FluentIcons.Regular.Frame: ImageVector
    get() {
        if (_Frame != null) {
            return _Frame!!
        }
        _Frame = ImageVector.Builder(
            name = "Regular.Frame",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6f, 2.75f)
                curveTo(6f, 2.336f, 5.664f, 2f, 5.25f, 2f)
                curveTo(4.836f, 2f, 4.5f, 2.336f, 4.5f, 2.75f)
                verticalLineTo(4.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 4.5f, 2f, 4.836f, 2f, 5.25f)
                curveTo(2f, 5.664f, 2.336f, 6f, 2.75f, 6f)
                horizontalLineTo(4.5f)
                verticalLineTo(18f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 18f, 2f, 18.336f, 2f, 18.75f)
                curveTo(2f, 19.164f, 2.336f, 19.5f, 2.75f, 19.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(21.25f)
                curveTo(4.5f, 21.664f, 4.836f, 22f, 5.25f, 22f)
                curveTo(5.664f, 22f, 6f, 21.664f, 6f, 21.25f)
                verticalLineTo(19.5f)
                horizontalLineTo(18f)
                verticalLineTo(21.25f)
                curveTo(18f, 21.664f, 18.336f, 22f, 18.75f, 22f)
                curveTo(19.164f, 22f, 19.5f, 21.664f, 19.5f, 21.25f)
                verticalLineTo(19.5f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 19.5f, 22f, 19.164f, 22f, 18.75f)
                curveTo(22f, 18.336f, 21.664f, 18f, 21.25f, 18f)
                horizontalLineTo(19.5f)
                verticalLineTo(6f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 6f, 22f, 5.664f, 22f, 5.25f)
                curveTo(22f, 4.836f, 21.664f, 4.5f, 21.25f, 4.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(2.75f)
                curveTo(19.5f, 2.336f, 19.164f, 2f, 18.75f, 2f)
                curveTo(18.336f, 2f, 18f, 2.336f, 18f, 2.75f)
                verticalLineTo(4.5f)
                horizontalLineTo(6f)
                verticalLineTo(2.75f)
                close()
                moveTo(18f, 18f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _Frame!!
    }

@Suppress("ObjectPropertyName")
private var _Frame: ImageVector? = null

@Preview
@Composable
private fun FramePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Frame, contentDescription = null)
    }
}
