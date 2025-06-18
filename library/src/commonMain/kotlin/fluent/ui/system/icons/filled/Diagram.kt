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

public val FluentUi.Filled.Diagram: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Diagram",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 5.25f)
            curveTo(2f, 3.455f, 3.455f, 2f, 5.25f, 2f)
            horizontalLineTo(15.75f)
            curveTo(17.545f, 2f, 19f, 3.455f, 19f, 5.25f)
            verticalLineTo(11.283f)
            curveTo(18.626f, 11.099f, 18.211f, 11f, 17.785f, 11f)
            horizontalLineTo(17.5f)
            verticalLineTo(5.25f)
            curveTo(17.5f, 4.284f, 16.716f, 3.5f, 15.75f, 3.5f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 3.5f, 3.5f, 4.284f, 3.5f, 5.25f)
            verticalLineTo(16.75f)
            curveTo(3.5f, 17.716f, 4.284f, 18.5f, 5.25f, 18.5f)
            horizontalLineTo(8.62f)
            lineTo(7.357f, 20f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 20f, 2f, 18.545f, 2f, 16.75f)
            verticalLineTo(5.25f)
            close()
            moveTo(6.75f, 6f)
            curveTo(6.336f, 6f, 6f, 6.336f, 6f, 6.75f)
            curveTo(6f, 7.164f, 6.336f, 7.5f, 6.75f, 7.5f)
            horizontalLineTo(14.25f)
            curveTo(14.664f, 7.5f, 15f, 7.164f, 15f, 6.75f)
            curveTo(15f, 6.336f, 14.664f, 6f, 14.25f, 6f)
            horizontalLineTo(6.75f)
            close()
            moveTo(7.07f, 12.434f)
            curveTo(7.193f, 12.169f, 7.458f, 12f, 7.75f, 12f)
            horizontalLineTo(17.785f)
            curveTo(18.301f, 12f, 18.791f, 12.228f, 19.123f, 12.623f)
            lineTo(22.824f, 17.017f)
            curveTo(23.059f, 17.296f, 23.059f, 17.704f, 22.824f, 17.983f)
            lineTo(19.123f, 22.377f)
            curveTo(18.791f, 22.772f, 18.301f, 23f, 17.785f, 23f)
            horizontalLineTo(7.75f)
            curveTo(7.458f, 23f, 7.193f, 22.831f, 7.07f, 22.566f)
            curveTo(6.947f, 22.302f, 6.988f, 21.99f, 7.176f, 21.767f)
            lineTo(10.769f, 17.5f)
            lineTo(7.176f, 13.233f)
            curveTo(6.988f, 13.01f, 6.947f, 12.698f, 7.07f, 12.434f)
            close()
            moveTo(6.75f, 9f)
            curveTo(6.336f, 9f, 6f, 9.336f, 6f, 9.75f)
            curveTo(6f, 10.164f, 6.336f, 10.5f, 6.75f, 10.5f)
            horizontalLineTo(11.25f)
            curveTo(11.664f, 10.5f, 12f, 10.164f, 12f, 9.75f)
            curveTo(12f, 9.336f, 11.664f, 9f, 11.25f, 9f)
            horizontalLineTo(6.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DiagramPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Diagram, contentDescription = null)
    }
}
