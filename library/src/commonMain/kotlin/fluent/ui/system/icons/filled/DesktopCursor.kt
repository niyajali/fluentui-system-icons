package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.DesktopCursor: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DesktopCursor",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.75f, 22f)
            curveTo(6.336f, 22f, 6f, 21.665f, 6f, 21.25f)
            curveTo(6f, 20.871f, 6.282f, 20.557f, 6.648f, 20.507f)
            lineTo(6.75f, 20.5f)
            lineTo(8.499f, 20.5f)
            verticalLineTo(18.002f)
            lineTo(4.25f, 18.002f)
            curveTo(3.059f, 18.002f, 2.084f, 17.077f, 2.005f, 15.906f)
            lineTo(2f, 15.752f)
            verticalLineTo(5.25f)
            curveTo(2f, 4.059f, 2.925f, 3.084f, 4.096f, 3.005f)
            lineTo(4.25f, 3f)
            horizontalLineTo(19.749f)
            curveTo(20.94f, 3f, 21.914f, 3.925f, 21.994f, 5.096f)
            lineTo(21.999f, 5.25f)
            verticalLineTo(15.752f)
            curveTo(21.999f, 16.124f, 21.909f, 16.475f, 21.749f, 16.784f)
            lineTo(17.054f, 11.578f)
            curveTo(16.569f, 11.041f, 15.803f, 10.857f, 15.127f, 11.117f)
            curveTo(14.451f, 11.377f, 14.005f, 12.026f, 14.005f, 12.75f)
            lineTo(14.002f, 18.002f)
            horizontalLineTo(9.998f)
            lineTo(9.999f, 20.5f)
            horizontalLineTo(14.001f)
            lineTo(14f, 22f)
            horizontalLineTo(6.75f)
            close()
            moveTo(15.486f, 12.05f)
            curveTo(15.776f, 11.939f, 16.104f, 12.018f, 16.312f, 12.248f)
            lineTo(22.677f, 19.306f)
            curveTo(22.897f, 19.551f, 22.932f, 19.911f, 22.763f, 20.194f)
            curveTo(22.593f, 20.476f, 22.259f, 20.615f, 21.939f, 20.536f)
            lineTo(18.402f, 19.658f)
            lineTo(16.372f, 22.672f)
            curveTo(16.188f, 22.946f, 15.846f, 23.067f, 15.531f, 22.97f)
            curveTo(15.215f, 22.874f, 15f, 22.583f, 15f, 22.253f)
            lineTo(15.005f, 12.75f)
            curveTo(15.005f, 12.44f, 15.196f, 12.162f, 15.486f, 12.05f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DesktopCursorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DesktopCursor, contentDescription = null)
    }
}
