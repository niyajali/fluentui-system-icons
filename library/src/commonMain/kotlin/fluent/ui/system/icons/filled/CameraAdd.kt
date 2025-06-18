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

public val FluentUi.Filled.CameraAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CameraAdd",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.5f, 12.001f)
            curveTo(20.538f, 12.001f, 23f, 14.463f, 23f, 17.501f)
            curveTo(23f, 20.538f, 20.538f, 23.001f, 17.5f, 23.001f)
            curveTo(14.462f, 23.001f, 12f, 20.538f, 12f, 17.501f)
            curveTo(12f, 14.463f, 14.462f, 12.001f, 17.5f, 12.001f)
            close()
            moveTo(17.5f, 14f)
            lineTo(17.41f, 14.008f)
            curveTo(17.206f, 14.045f, 17.045f, 14.206f, 17.008f, 14.41f)
            lineTo(17f, 14.5f)
            lineTo(17f, 17f)
            lineTo(14.498f, 17.001f)
            lineTo(14.408f, 17.009f)
            curveTo(14.204f, 17.046f, 14.043f, 17.207f, 14.006f, 17.411f)
            lineTo(13.998f, 17.501f)
            lineTo(14.006f, 17.591f)
            curveTo(14.043f, 17.795f, 14.204f, 17.956f, 14.408f, 17.993f)
            lineTo(14.498f, 18.001f)
            lineTo(17.001f, 18f)
            lineTo(17.001f, 20.504f)
            lineTo(17.009f, 20.594f)
            curveTo(17.046f, 20.798f, 17.207f, 20.959f, 17.411f, 20.996f)
            lineTo(17.501f, 21.004f)
            lineTo(17.591f, 20.996f)
            curveTo(17.795f, 20.959f, 17.956f, 20.798f, 17.993f, 20.594f)
            lineTo(18.001f, 20.504f)
            lineTo(18.001f, 18f)
            lineTo(20.505f, 18.001f)
            lineTo(20.594f, 17.993f)
            curveTo(20.799f, 17.956f, 20.959f, 17.795f, 20.997f, 17.591f)
            lineTo(21.005f, 17.501f)
            lineTo(20.997f, 17.411f)
            curveTo(20.959f, 17.207f, 20.799f, 17.046f, 20.594f, 17.009f)
            lineTo(20.505f, 17.001f)
            lineTo(18f, 17f)
            lineTo(18f, 14.5f)
            lineTo(17.992f, 14.41f)
            curveTo(17.955f, 14.206f, 17.794f, 14.045f, 17.59f, 14.008f)
            lineTo(17.5f, 14f)
            close()
            moveTo(13.925f, 2.504f)
            curveTo(14.722f, 2.504f, 15.461f, 2.926f, 15.865f, 3.614f)
            lineTo(16.679f, 5.001f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 5.001f, 22f, 6.456f, 22f, 8.251f)
            lineTo(22.001f, 12.811f)
            curveTo(20.833f, 11.69f, 19.247f, 11.001f, 17.5f, 11.001f)
            curveTo(17.084f, 11.001f, 16.677f, 11.04f, 16.282f, 11.115f)
            curveTo(15.698f, 9.308f, 14.002f, 8.001f, 12f, 8.001f)
            curveTo(9.515f, 8.001f, 7.5f, 10.016f, 7.5f, 12.501f)
            curveTo(7.5f, 14.652f, 9.01f, 16.451f, 11.028f, 16.896f)
            curveTo(11.009f, 17.095f, 11f, 17.297f, 11f, 17.501f)
            curveTo(11f, 18.79f, 11.375f, 19.991f, 12.022f, 21.001f)
            lineTo(5.25f, 21.001f)
            curveTo(3.455f, 21.001f, 2f, 19.546f, 2f, 17.751f)
            verticalLineTo(8.251f)
            curveTo(2f, 6.456f, 3.455f, 5.001f, 5.25f, 5.001f)
            horizontalLineTo(7.33f)
            lineTo(8.205f, 3.577f)
            curveTo(8.614f, 2.91f, 9.34f, 2.504f, 10.122f, 2.504f)
            horizontalLineTo(13.925f)
            close()
            moveTo(12f, 9.501f)
            curveTo(13.33f, 9.501f, 14.457f, 10.366f, 14.851f, 11.564f)
            curveTo(13.203f, 12.3f, 11.919f, 13.701f, 11.338f, 15.426f)
            curveTo(10f, 15.126f, 9f, 13.93f, 9f, 12.501f)
            curveTo(9f, 10.844f, 10.343f, 9.501f, 12f, 9.501f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CameraAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CameraAdd, contentDescription = null)
    }
}
