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

public val FluentUi.Filled.ChatLock: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChatLock",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(22f, 12f)
            curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
            curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
            curveTo(2f, 13.643f, 2.397f, 15.229f, 3.145f, 16.65f)
            lineTo(2.029f, 20.939f)
            curveTo(1.992f, 21.079f, 1.992f, 21.227f, 2.029f, 21.367f)
            curveTo(2.147f, 21.821f, 2.611f, 22.094f, 3.065f, 21.975f)
            lineTo(7.356f, 20.858f)
            curveTo(8.775f, 21.604f, 10.36f, 22f, 12f, 22f)
            curveTo(12.351f, 22f, 12.698f, 21.982f, 13.04f, 21.947f)
            curveTo(13.014f, 21.802f, 13f, 21.652f, 13f, 21.5f)
            verticalLineTo(16.5f)
            curveTo(13f, 15.29f, 13.859f, 14.282f, 15f, 14.05f)
            verticalLineTo(14f)
            curveTo(15f, 12.067f, 16.567f, 10.5f, 18.5f, 10.5f)
            curveTo(20.179f, 10.5f, 21.582f, 11.682f, 21.921f, 13.259f)
            curveTo(21.973f, 12.847f, 22f, 12.427f, 22f, 12f)
            close()
            moveTo(16f, 15f)
            horizontalLineTo(15.5f)
            curveTo(14.672f, 15f, 14f, 15.672f, 14f, 16.5f)
            verticalLineTo(21.5f)
            curveTo(14f, 22.328f, 14.672f, 23f, 15.5f, 23f)
            horizontalLineTo(21.5f)
            curveTo(22.328f, 23f, 23f, 22.328f, 23f, 21.5f)
            verticalLineTo(16.5f)
            curveTo(23f, 15.672f, 22.328f, 15f, 21.5f, 15f)
            horizontalLineTo(21f)
            verticalLineTo(14f)
            curveTo(21f, 12.619f, 19.881f, 11.5f, 18.5f, 11.5f)
            curveTo(17.119f, 11.5f, 16f, 12.619f, 16f, 14f)
            verticalLineTo(15f)
            close()
            moveTo(17.5f, 14f)
            curveTo(17.5f, 13.448f, 17.948f, 13f, 18.5f, 13f)
            curveTo(19.052f, 13f, 19.5f, 13.448f, 19.5f, 14f)
            verticalLineTo(15f)
            horizontalLineTo(17.5f)
            verticalLineTo(14f)
            close()
            moveTo(19.5f, 19f)
            curveTo(19.5f, 19.552f, 19.052f, 20f, 18.5f, 20f)
            curveTo(17.948f, 20f, 17.5f, 19.552f, 17.5f, 19f)
            curveTo(17.5f, 18.448f, 17.948f, 18f, 18.5f, 18f)
            curveTo(19.052f, 18f, 19.5f, 18.448f, 19.5f, 19f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ChatLockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ChatLock, contentDescription = null)
    }
}
