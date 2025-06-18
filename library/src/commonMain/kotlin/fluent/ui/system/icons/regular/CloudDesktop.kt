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

public val FluentUi.Regular.CloudDesktop: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CloudDesktop",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(22f, 13f)
            curveTo(22.552f, 13f, 23f, 13.448f, 23f, 14f)
            verticalLineTo(19f)
            curveTo(23f, 19.552f, 22.552f, 20f, 22f, 20f)
            horizontalLineTo(19f)
            verticalLineTo(21.5f)
            horizontalLineTo(19.25f)
            curveTo(19.664f, 21.5f, 20f, 21.836f, 20f, 22.25f)
            curveTo(20f, 22.275f, 19.999f, 22.3f, 19.996f, 22.324f)
            curveTo(19.999f, 22.341f, 20f, 22.358f, 20f, 22.375f)
            curveTo(20f, 22.651f, 19.651f, 23f, 19.375f, 23f)
            horizontalLineTo(15.625f)
            curveTo(15.349f, 23f, 15f, 22.651f, 15f, 22.375f)
            curveTo(15f, 22.358f, 15.002f, 22.341f, 15.004f, 22.324f)
            curveTo(15.002f, 22.3f, 15f, 22.275f, 15f, 22.25f)
            curveTo(15f, 21.836f, 15.336f, 21.5f, 15.75f, 21.5f)
            horizontalLineTo(16f)
            verticalLineTo(20f)
            horizontalLineTo(13f)
            curveTo(12.448f, 20f, 12f, 19.552f, 12f, 19f)
            verticalLineTo(14f)
            curveTo(12f, 13.448f, 12.448f, 13f, 13f, 13f)
            horizontalLineTo(22f)
            close()
            moveTo(12f, 4f)
            curveTo(14.98f, 4f, 17.452f, 6.172f, 17.92f, 9.02f)
            curveTo(19.695f, 9.184f, 21.171f, 10.379f, 21.744f, 12f)
            horizontalLineTo(20.095f)
            curveTo(19.576f, 11.104f, 18.61f, 10.5f, 17.5f, 10.5f)
            horizontalLineTo(17.244f)
            curveTo(16.844f, 10.5f, 16.514f, 10.185f, 16.495f, 9.785f)
            curveTo(16.383f, 7.4f, 14.413f, 5.5f, 12f, 5.5f)
            curveTo(9.587f, 5.5f, 7.617f, 7.4f, 7.505f, 9.785f)
            curveTo(7.486f, 10.185f, 7.156f, 10.5f, 6.756f, 10.5f)
            horizontalLineTo(6.5f)
            curveTo(4.843f, 10.5f, 3.5f, 11.843f, 3.5f, 13.5f)
            curveTo(3.5f, 15.157f, 4.843f, 16.5f, 6.5f, 16.5f)
            horizontalLineTo(11f)
            verticalLineTo(18f)
            horizontalLineTo(6.5f)
            curveTo(4.015f, 18f, 2f, 15.985f, 2f, 13.5f)
            curveTo(2f, 11.156f, 3.792f, 9.231f, 6.08f, 9.02f)
            curveTo(6.548f, 6.172f, 9.02f, 4f, 12f, 4f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CloudDesktopPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CloudDesktop, contentDescription = null)
    }
}
