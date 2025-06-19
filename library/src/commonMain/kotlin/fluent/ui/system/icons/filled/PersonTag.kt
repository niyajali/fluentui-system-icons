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

public val FluentIcons.Filled.PersonTag: ImageVector
    get() {
        if (_PersonTag != null) {
            return _PersonTag!!
        }
        _PersonTag = ImageVector.Builder(
            name = "Filled.PersonTag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11f, 14f)
                verticalLineTo(16.935f)
                curveTo(11f, 17.72f, 11.309f, 18.473f, 11.859f, 19.033f)
                lineTo(14.115f, 21.33f)
                curveTo(12.935f, 21.778f, 11.561f, 22.001f, 10f, 22.001f)
                curveTo(6.579f, 22.001f, 4.056f, 20.929f, 2.514f, 18.765f)
                curveTo(2.182f, 18.299f, 2.004f, 17.741f, 2.004f, 17.169f)
                verticalLineTo(16.249f)
                curveTo(2.004f, 15.007f, 3.011f, 14f, 4.253f, 14f)
                horizontalLineTo(11f)
                close()
                moveTo(15f, 7.005f)
                curveTo(15f, 4.243f, 12.762f, 2.005f, 10f, 2.005f)
                curveTo(7.239f, 2.005f, 5f, 4.243f, 5f, 7.005f)
                curveTo(5f, 9.766f, 7.239f, 12.005f, 10f, 12.005f)
                curveTo(12.762f, 12.005f, 15f, 9.766f, 15f, 7.005f)
                close()
                moveTo(16.572f, 22.404f)
                lineTo(12.572f, 18.332f)
                curveTo(12.205f, 17.959f, 12f, 17.457f, 12f, 16.935f)
                verticalLineTo(13.999f)
                curveTo(12f, 12.897f, 12.896f, 12.003f, 14.002f, 12.002f)
                lineTo(16.919f, 12f)
                curveTo(17.446f, 12f, 17.953f, 12.207f, 18.329f, 12.577f)
                lineTo(22.404f, 16.591f)
                curveTo(23.193f, 17.368f, 23.199f, 18.636f, 22.416f, 19.42f)
                lineTo(19.424f, 22.416f)
                curveTo(18.636f, 23.205f, 17.353f, 23.2f, 16.572f, 22.404f)
                close()
                moveTo(14.996f, 16f)
                curveTo(15.548f, 16f, 15.995f, 15.552f, 15.995f, 15f)
                curveTo(15.995f, 14.448f, 15.548f, 14f, 14.996f, 14f)
                curveTo(14.445f, 14f, 13.998f, 14.448f, 13.998f, 15f)
                curveTo(13.998f, 15.552f, 14.445f, 16f, 14.996f, 16f)
                close()
            }
        }.build()

        return _PersonTag!!
    }

@Suppress("ObjectPropertyName")
private var _PersonTag: ImageVector? = null

@Preview
@Composable
private fun PersonTagPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PersonTag, contentDescription = null)
    }
}
