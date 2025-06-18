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

public val FluentUi.Regular.PersonClock: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PersonClock",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.022f, 14f)
            curveTo(11.725f, 14.463f, 11.486f, 14.967f, 11.314f, 15.5f)
            horizontalLineTo(4.253f)
            curveTo(3.839f, 15.5f, 3.504f, 15.835f, 3.504f, 16.249f)
            verticalLineTo(16.826f)
            curveTo(3.504f, 17.362f, 3.695f, 17.88f, 4.043f, 18.288f)
            curveTo(5.296f, 19.755f, 7.262f, 20.501f, 10f, 20.501f)
            curveTo(10.596f, 20.501f, 11.156f, 20.466f, 11.679f, 20.395f)
            curveTo(11.926f, 20.89f, 12.233f, 21.349f, 12.593f, 21.763f)
            curveTo(11.796f, 21.922f, 10.931f, 22.001f, 10f, 22.001f)
            curveTo(6.854f, 22.001f, 4.468f, 21.096f, 2.902f, 19.262f)
            curveTo(2.322f, 18.583f, 2.004f, 17.719f, 2.004f, 16.826f)
            verticalLineTo(16.249f)
            curveTo(2.004f, 15.007f, 3.011f, 14f, 4.253f, 14f)
            horizontalLineTo(12.022f)
            close()
            moveTo(15f, 7.005f)
            curveTo(15f, 4.243f, 12.762f, 2.005f, 10f, 2.005f)
            curveTo(7.239f, 2.005f, 5f, 4.243f, 5f, 7.005f)
            curveTo(5f, 9.766f, 7.239f, 12.005f, 10f, 12.005f)
            curveTo(12.762f, 12.005f, 15f, 9.766f, 15f, 7.005f)
            close()
            moveTo(6.5f, 7.005f)
            curveTo(6.5f, 5.072f, 8.067f, 3.505f, 10f, 3.505f)
            curveTo(11.933f, 3.505f, 13.5f, 5.072f, 13.5f, 7.005f)
            curveTo(13.5f, 8.938f, 11.933f, 10.505f, 10f, 10.505f)
            curveTo(8.067f, 10.505f, 6.5f, 8.938f, 6.5f, 7.005f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
            curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
            curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
            curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
            close()
            moveTo(17.5f, 14f)
            curveTo(17.776f, 14f, 18f, 14.224f, 18f, 14.5f)
            verticalLineTo(17f)
            horizontalLineTo(20f)
            curveTo(20.276f, 17f, 20.5f, 17.224f, 20.5f, 17.5f)
            curveTo(20.5f, 17.776f, 20.276f, 18f, 20f, 18f)
            horizontalLineTo(17.5f)
            curveTo(17.224f, 18f, 17f, 17.776f, 17f, 17.5f)
            verticalLineTo(14.5f)
            curveTo(17f, 14.224f, 17.224f, 14f, 17.5f, 14f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonClockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PersonClock, contentDescription = null)
    }
}
