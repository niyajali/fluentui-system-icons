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

public val FluentUi.Regular.PhoneScreenTime: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PhoneScreenTime",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            close()
            moveTo(13.75f, 2f)
            curveTo(14.993f, 2f, 16f, 3.007f, 16f, 4.25f)
            lineTo(16f, 11.174f)
            curveTo(15.472f, 11.299f, 14.969f, 11.488f, 14.5f, 11.732f)
            lineTo(14.5f, 4.25f)
            curveTo(14.5f, 3.836f, 14.164f, 3.5f, 13.75f, 3.5f)
            horizontalLineTo(6.25f)
            curveTo(5.836f, 3.5f, 5.5f, 3.836f, 5.5f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(5.5f, 20.164f, 5.836f, 20.5f, 6.25f, 20.5f)
            lineTo(11.733f, 20.501f)
            curveTo(12.02f, 21.052f, 12.384f, 21.557f, 12.81f, 22.001f)
            lineTo(6.25f, 22f)
            curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
            verticalLineTo(4.25f)
            curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
            horizontalLineTo(13.75f)
            close()
            moveTo(8.749f, 17.504f)
            lineTo(11f, 17.499f)
            curveTo(11f, 18.016f, 11.06f, 18.518f, 11.174f, 19f)
            lineTo(8.751f, 19.004f)
            curveTo(8.337f, 19.004f, 8.001f, 18.669f, 8f, 18.255f)
            curveTo(7.999f, 17.841f, 8.335f, 17.504f, 8.749f, 17.504f)
            close()
            moveTo(16.5f, 14f)
            curveTo(16.224f, 14f, 16f, 14.224f, 16f, 14.5f)
            verticalLineTo(18.5f)
            curveTo(16f, 18.776f, 16.224f, 19f, 16.5f, 19f)
            horizontalLineTo(19.501f)
            curveTo(19.778f, 19f, 20.001f, 18.776f, 20.001f, 18.5f)
            curveTo(20.001f, 18.224f, 19.778f, 18f, 19.501f, 18f)
            horizontalLineTo(17f)
            verticalLineTo(14.5f)
            curveTo(17f, 14.224f, 16.776f, 14f, 16.5f, 14f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PhoneScreenTimePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PhoneScreenTime, contentDescription = null)
    }
}
