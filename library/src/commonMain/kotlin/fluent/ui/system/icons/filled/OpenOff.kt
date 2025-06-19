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

public val FluentIcons.Filled.OpenOff: ImageVector
    get() {
        if (_OpenOff != null) {
            return _OpenOff!!
        }
        _OpenOff = ImageVector.Builder(
            name = "Filled.OpenOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.28f, 2.22f)
                curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
                curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
                lineTo(3.483f, 4.544f)
                curveTo(3.177f, 5.04f, 3f, 5.624f, 3f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(17.75f)
                curveTo(18.376f, 21f, 18.96f, 20.823f, 19.456f, 20.517f)
                lineTo(20.719f, 21.781f)
                curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
                curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(17.927f, 18.988f)
                curveTo(17.869f, 18.996f, 17.81f, 19f, 17.75f, 19f)
                horizontalLineTo(6.25f)
                curveTo(5.56f, 19f, 5f, 18.44f, 5f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(5f, 6.19f, 5.004f, 6.131f, 5.012f, 6.073f)
                lineTo(17.927f, 18.988f)
                close()
                moveTo(13.014f, 9.832f)
                lineTo(14.168f, 10.986f)
                curveTo(14.365f, 10.953f, 14.555f, 10.86f, 14.707f, 10.707f)
                lineTo(19f, 6.414f)
                verticalLineTo(10f)
                curveTo(19f, 10.552f, 19.448f, 11f, 20f, 11f)
                curveTo(20.552f, 11f, 21f, 10.552f, 21f, 10f)
                verticalLineTo(4f)
                curveTo(21f, 3.448f, 20.552f, 3f, 20f, 3f)
                horizontalLineTo(14f)
                curveTo(13.448f, 3f, 13f, 3.448f, 13f, 4f)
                curveTo(13f, 4.552f, 13.448f, 5f, 14f, 5f)
                horizontalLineTo(17.586f)
                lineTo(13.293f, 9.293f)
                curveTo(13.141f, 9.445f, 13.047f, 9.635f, 13.014f, 9.832f)
                close()
                moveTo(20.999f, 17.818f)
                lineTo(19f, 15.818f)
                verticalLineTo(14f)
                curveTo(19f, 13.448f, 19.448f, 13f, 20f, 13f)
                curveTo(20.552f, 13f, 21f, 13.448f, 21f, 14f)
                verticalLineTo(17.75f)
                curveTo(21f, 17.773f, 21f, 17.795f, 20.999f, 17.818f)
                close()
                moveTo(6.183f, 3.001f)
                lineTo(8.182f, 5f)
                horizontalLineTo(10f)
                curveTo(10.552f, 5f, 11f, 4.552f, 11f, 4f)
                curveTo(11f, 3.448f, 10.552f, 3f, 10f, 3f)
                horizontalLineTo(6.25f)
                curveTo(6.227f, 3f, 6.205f, 3f, 6.183f, 3.001f)
                close()
            }
        }.build()

        return _OpenOff!!
    }

@Suppress("ObjectPropertyName")
private var _OpenOff: ImageVector? = null

@Preview
@Composable
private fun OpenOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.OpenOff, contentDescription = null)
    }
}
