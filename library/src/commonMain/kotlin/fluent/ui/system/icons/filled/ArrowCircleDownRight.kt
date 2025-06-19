package fluent.ui.system.icons.filled

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

public val FluentIcons.Filled.ArrowCircleDownRight: ImageVector
    get() {
        if (_ArrowCircleDownRight != null) {
            return _ArrowCircleDownRight!!
        }
        _ArrowCircleDownRight = ImageVector.Builder(
            name = "Filled.ArrowCircleDownRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
                moveTo(14.5f, 8.75f)
                curveTo(14.5f, 8.336f, 14.836f, 8f, 15.25f, 8f)
                curveTo(15.664f, 8f, 16f, 8.336f, 16f, 8.75f)
                verticalLineTo(15.25f)
                curveTo(16f, 15.664f, 15.664f, 16f, 15.25f, 16f)
                horizontalLineTo(8.75f)
                curveTo(8.336f, 16f, 8f, 15.664f, 8f, 15.25f)
                curveTo(8f, 14.836f, 8.336f, 14.5f, 8.75f, 14.5f)
                horizontalLineTo(13.49f)
                lineTo(8.222f, 9.283f)
                curveTo(7.928f, 8.991f, 7.926f, 8.517f, 8.217f, 8.222f)
                curveTo(8.509f, 7.928f, 8.983f, 7.926f, 9.278f, 8.217f)
                lineTo(14.5f, 13.389f)
                verticalLineTo(8.75f)
                close()
            }
        }.build()

        return _ArrowCircleDownRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowCircleDownRight: ImageVector? = null

@Preview
@Composable
private fun ArrowCircleDownRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowCircleDownRight, contentDescription = null)
    }
}
