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

public val FluentIcons.Regular.ArrowExit: ImageVector
    get() {
        if (_ArrowExit != null) {
            return _ArrowExit!!
        }
        _ArrowExit = ImageVector.Builder(
            name = "Regular.ArrowExit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.25f, 3f)
                curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(15.25f)
                curveTo(15.664f, 21f, 16f, 20.664f, 16f, 20.25f)
                curveTo(16f, 19.836f, 15.664f, 19.5f, 15.25f, 19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(15.25f)
                curveTo(15.664f, 4.5f, 16f, 4.164f, 16f, 3.75f)
                curveTo(16f, 3.336f, 15.664f, 3f, 15.25f, 3f)
                horizontalLineTo(6.25f)
                close()
                moveTo(17.53f, 7.22f)
                curveTo(17.237f, 6.927f, 16.763f, 6.927f, 16.47f, 7.22f)
                curveTo(16.177f, 7.513f, 16.177f, 7.987f, 16.47f, 8.28f)
                lineTo(19.439f, 11.25f)
                horizontalLineTo(8.75f)
                curveTo(8.336f, 11.25f, 8f, 11.586f, 8f, 12f)
                curveTo(8f, 12.414f, 8.336f, 12.75f, 8.75f, 12.75f)
                horizontalLineTo(19.439f)
                lineTo(16.47f, 15.72f)
                curveTo(16.177f, 16.013f, 16.177f, 16.487f, 16.47f, 16.78f)
                curveTo(16.763f, 17.073f, 17.237f, 17.073f, 17.53f, 16.78f)
                lineTo(21.78f, 12.53f)
                curveTo(22.073f, 12.237f, 22.073f, 11.763f, 21.78f, 11.47f)
                lineTo(17.53f, 7.22f)
                close()
            }
        }.build()

        return _ArrowExit!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowExit: ImageVector? = null

@Preview
@Composable
private fun ArrowExitPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowExit, contentDescription = null)
    }
}
