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

public val FluentIcons.Filled.PersonDelete: ImageVector
    get() {
        if (_PersonDelete != null) {
            return _PersonDelete!!
        }
        _PersonDelete = ImageVector.Builder(
            name = "Filled.PersonDelete",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.463f, 23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.463f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.463f, 14.463f, 12f, 17.5f, 12f)
                close()
                moveTo(12.023f, 14f)
                curveTo(11.375f, 15.01f, 11f, 16.211f, 11f, 17.5f)
                curveTo(11f, 19.144f, 11.611f, 20.646f, 12.618f, 21.791f)
                curveTo(11.815f, 21.931f, 10.942f, 22.001f, 10f, 22.001f)
                curveTo(7.111f, 22.001f, 4.872f, 21.345f, 3.309f, 20.001f)
                curveTo(2.481f, 19.289f, 2.004f, 18.25f, 2.004f, 17.157f)
                verticalLineTo(16.25f)
                curveTo(2.004f, 15.007f, 3.011f, 14f, 4.254f, 14f)
                lineTo(12.023f, 14f)
                close()
                moveTo(15.093f, 14.967f)
                lineTo(15.024f, 15.024f)
                lineTo(14.966f, 15.094f)
                curveTo(14.848f, 15.264f, 14.848f, 15.492f, 14.966f, 15.662f)
                lineTo(15.024f, 15.731f)
                lineTo(16.794f, 17.501f)
                lineTo(15.027f, 19.268f)
                lineTo(14.969f, 19.337f)
                curveTo(14.851f, 19.507f, 14.851f, 19.735f, 14.969f, 19.906f)
                lineTo(15.027f, 19.975f)
                lineTo(15.096f, 20.033f)
                curveTo(15.267f, 20.151f, 15.494f, 20.151f, 15.665f, 20.033f)
                lineTo(15.734f, 19.975f)
                lineTo(17.501f, 18.208f)
                lineTo(19.27f, 19.977f)
                lineTo(19.339f, 20.035f)
                curveTo(19.51f, 20.153f, 19.737f, 20.153f, 19.908f, 20.035f)
                lineTo(19.977f, 19.977f)
                lineTo(20.035f, 19.908f)
                curveTo(20.153f, 19.737f, 20.153f, 19.51f, 20.035f, 19.339f)
                lineTo(19.977f, 19.27f)
                lineTo(18.208f, 17.501f)
                lineTo(19.98f, 15.732f)
                lineTo(20.038f, 15.662f)
                curveTo(20.156f, 15.492f, 20.156f, 15.264f, 20.038f, 15.094f)
                lineTo(19.98f, 15.024f)
                lineTo(19.91f, 14.967f)
                curveTo(19.74f, 14.849f, 19.512f, 14.849f, 19.342f, 14.967f)
                lineTo(19.272f, 15.024f)
                lineTo(17.501f, 16.794f)
                lineTo(15.731f, 15.024f)
                lineTo(15.662f, 14.967f)
                curveTo(15.516f, 14.865f, 15.328f, 14.851f, 15.17f, 14.923f)
                lineTo(15.093f, 14.967f)
                close()
                moveTo(10f, 2.005f)
                curveTo(12.762f, 2.005f, 15f, 4.243f, 15f, 7.005f)
                curveTo(15f, 9.766f, 12.762f, 12.005f, 10f, 12.005f)
                curveTo(7.239f, 12.005f, 5f, 9.766f, 5f, 7.005f)
                curveTo(5f, 4.243f, 7.239f, 2.005f, 10f, 2.005f)
                close()
            }
        }.build()

        return _PersonDelete!!
    }

@Suppress("ObjectPropertyName")
private var _PersonDelete: ImageVector? = null

@Preview
@Composable
private fun PersonDeletePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PersonDelete, contentDescription = null)
    }
}
