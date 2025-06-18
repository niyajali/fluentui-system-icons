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

public val FluentUi.Regular.Cloud: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Cloud",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 5.5f)
            curveTo(9.587f, 5.5f, 7.617f, 7.4f, 7.505f, 9.785f)
            curveTo(7.486f, 10.185f, 7.156f, 10.5f, 6.756f, 10.5f)
            horizontalLineTo(6.5f)
            curveTo(4.843f, 10.5f, 3.5f, 11.843f, 3.5f, 13.5f)
            curveTo(3.5f, 15.157f, 4.843f, 16.5f, 6.5f, 16.5f)
            horizontalLineTo(17.5f)
            curveTo(19.157f, 16.5f, 20.5f, 15.157f, 20.5f, 13.5f)
            curveTo(20.5f, 11.843f, 19.157f, 10.5f, 17.5f, 10.5f)
            horizontalLineTo(17.244f)
            curveTo(16.844f, 10.5f, 16.514f, 10.185f, 16.495f, 9.785f)
            curveTo(16.383f, 7.4f, 14.413f, 5.5f, 12f, 5.5f)
            close()
            moveTo(6.08f, 9.019f)
            curveTo(6.548f, 6.172f, 9.02f, 4f, 12f, 4f)
            curveTo(14.98f, 4f, 17.452f, 6.172f, 17.92f, 9.019f)
            curveTo(20.208f, 9.231f, 22f, 11.156f, 22f, 13.5f)
            curveTo(22f, 15.985f, 19.985f, 18f, 17.5f, 18f)
            horizontalLineTo(6.5f)
            curveTo(4.015f, 18f, 2f, 15.985f, 2f, 13.5f)
            curveTo(2f, 11.156f, 3.792f, 9.231f, 6.08f, 9.019f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CloudPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Cloud, contentDescription = null)
    }
}
