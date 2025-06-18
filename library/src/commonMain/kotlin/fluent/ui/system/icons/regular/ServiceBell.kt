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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.ServiceBell: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ServiceBell",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.75f, 7.5f)
            curveTo(11.336f, 7.5f, 11f, 7.836f, 11f, 8.25f)
            curveTo(11f, 8.664f, 11.336f, 9f, 11.75f, 9f)
            curveTo(13.072f, 9f, 14.462f, 9.759f, 15.159f, 10.756f)
            curveTo(15.397f, 11.095f, 15.865f, 11.178f, 16.204f, 10.94f)
            curveTo(16.543f, 10.703f, 16.626f, 10.235f, 16.389f, 9.896f)
            curveTo(15.413f, 8.502f, 13.567f, 7.5f, 11.75f, 7.5f)
            close()
            moveTo(9.5f, 4.5f)
            curveTo(9.5f, 3.119f, 10.619f, 2f, 12f, 2f)
            curveTo(13.381f, 2f, 14.5f, 3.119f, 14.5f, 4.5f)
            verticalLineTo(5.38f)
            curveTo(17.84f, 6.433f, 20.25f, 9.561f, 20.25f, 13.25f)
            curveTo(20.25f, 13.664f, 19.914f, 14f, 19.5f, 14f)
            horizontalLineTo(4.5f)
            curveTo(4.086f, 14f, 3.75f, 13.664f, 3.75f, 13.25f)
            curveTo(3.75f, 9.571f, 6.172f, 6.457f, 9.5f, 5.392f)
            verticalLineTo(4.5f)
            close()
            moveTo(13f, 4.5f)
            curveTo(13f, 3.948f, 12.552f, 3.5f, 12f, 3.5f)
            curveTo(11.448f, 3.5f, 11f, 3.948f, 11f, 4.5f)
            verticalLineTo(5.063f)
            curveTo(11.335f, 5.021f, 11.676f, 5f, 12.021f, 5f)
            curveTo(12.353f, 5f, 12.679f, 5.02f, 13f, 5.057f)
            verticalLineTo(4.5f)
            close()
            moveTo(5.292f, 12.5f)
            horizontalLineTo(18.709f)
            curveTo(18.338f, 9.124f, 15.493f, 6.5f, 12.021f, 6.5f)
            curveTo(8.546f, 6.5f, 5.667f, 9.128f, 5.292f, 12.5f)
            close()
            moveTo(4f, 15f)
            curveTo(2.895f, 15f, 2f, 15.895f, 2f, 17f)
            curveTo(2f, 18.105f, 2.895f, 19f, 4f, 19f)
            horizontalLineTo(20f)
            curveTo(21.105f, 19f, 22f, 18.105f, 22f, 17f)
            curveTo(22f, 15.895f, 21.105f, 15f, 20f, 15f)
            horizontalLineTo(4f)
            close()
            moveTo(3.5f, 17f)
            curveTo(3.5f, 16.724f, 3.724f, 16.5f, 4f, 16.5f)
            horizontalLineTo(20f)
            curveTo(20.276f, 16.5f, 20.5f, 16.724f, 20.5f, 17f)
            curveTo(20.5f, 17.276f, 20.276f, 17.5f, 20f, 17.5f)
            horizontalLineTo(4f)
            curveTo(3.724f, 17.5f, 3.5f, 17.276f, 3.5f, 17f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ServiceBellPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ServiceBell, contentDescription = null)
    }
}
