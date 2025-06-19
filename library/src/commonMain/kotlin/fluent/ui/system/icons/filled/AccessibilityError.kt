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

public val FluentIcons.Filled.AccessibilityError: ImageVector
    get() {
        if (_AccessibilityError != null) {
            return _AccessibilityError!!
        }
        _AccessibilityError = ImageVector.Builder(
            name = "Filled.AccessibilityError",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 6.5f)
                curveTo(13.243f, 6.5f, 14.25f, 5.493f, 14.25f, 4.25f)
                curveTo(14.25f, 3.007f, 13.243f, 2f, 12f, 2f)
                curveTo(10.758f, 2f, 9.75f, 3.007f, 9.75f, 4.25f)
                curveTo(9.75f, 5.493f, 10.758f, 6.5f, 12f, 6.5f)
                close()
                moveTo(6.15f, 4.178f)
                curveTo(5.007f, 3.693f, 3.682f, 4.222f, 3.189f, 5.362f)
                curveTo(2.693f, 6.505f, 3.223f, 7.829f, 4.37f, 8.316f)
                lineTo(7.393f, 9.6f)
                curveTo(7.763f, 9.756f, 8.003f, 10.119f, 8.003f, 10.52f)
                verticalLineTo(13.56f)
                lineTo(6.124f, 19.017f)
                curveTo(5.719f, 20.192f, 6.344f, 21.472f, 7.519f, 21.877f)
                curveTo(8.694f, 22.281f, 9.974f, 21.657f, 10.379f, 20.482f)
                lineTo(10.524f, 20.06f)
                curveTo(10.187f, 19.274f, 10f, 18.409f, 10f, 17.5f)
                curveTo(10f, 14.078f, 12.645f, 11.273f, 16.003f, 11.019f)
                verticalLineTo(10.518f)
                curveTo(16.003f, 10.117f, 16.243f, 9.754f, 16.612f, 9.598f)
                lineTo(19.631f, 8.316f)
                curveTo(20.778f, 7.829f, 21.307f, 6.505f, 20.812f, 5.362f)
                curveTo(20.318f, 4.222f, 18.993f, 3.693f, 17.85f, 4.178f)
                lineTo(16.244f, 4.86f)
                curveTo(15.904f, 5.004f, 15.666f, 5.283f, 15.55f, 5.591f)
                curveTo(15.008f, 7.025f, 13.622f, 8.043f, 12f, 8.043f)
                curveTo(10.379f, 8.043f, 8.993f, 7.025f, 8.451f, 5.591f)
                curveTo(8.335f, 5.283f, 8.097f, 5.004f, 7.756f, 4.86f)
                lineTo(6.15f, 4.178f)
                close()
                moveTo(22f, 17.5f)
                curveTo(22f, 20.538f, 19.538f, 23f, 16.5f, 23f)
                curveTo(13.463f, 23f, 11f, 20.538f, 11f, 17.5f)
                curveTo(11f, 14.462f, 13.463f, 12f, 16.5f, 12f)
                curveTo(19.538f, 12f, 22f, 14.462f, 22f, 17.5f)
                close()
                moveTo(16.5f, 14f)
                curveTo(16.224f, 14f, 16f, 14.224f, 16f, 14.5f)
                verticalLineTo(18.5f)
                curveTo(16f, 18.776f, 16.224f, 19f, 16.5f, 19f)
                curveTo(16.777f, 19f, 17f, 18.776f, 17f, 18.5f)
                verticalLineTo(14.5f)
                curveTo(17f, 14.224f, 16.777f, 14f, 16.5f, 14f)
                close()
                moveTo(16.5f, 21.125f)
                curveTo(16.846f, 21.125f, 17.125f, 20.845f, 17.125f, 20.5f)
                curveTo(17.125f, 20.155f, 16.846f, 19.875f, 16.5f, 19.875f)
                curveTo(16.155f, 19.875f, 15.875f, 20.155f, 15.875f, 20.5f)
                curveTo(15.875f, 20.845f, 16.155f, 21.125f, 16.5f, 21.125f)
                close()
            }
        }.build()

        return _AccessibilityError!!
    }

@Suppress("ObjectPropertyName")
private var _AccessibilityError: ImageVector? = null

@Preview
@Composable
private fun AccessibilityErrorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.AccessibilityError, contentDescription = null)
    }
}
