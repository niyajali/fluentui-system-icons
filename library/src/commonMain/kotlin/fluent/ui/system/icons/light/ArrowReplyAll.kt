package fluent.ui.system.icons.light

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

public val FluentUi.Light.ArrowReplyAll: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.ArrowReplyAll",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.854f, 6.146f)
            curveTo(11.049f, 6.342f, 11.049f, 6.658f, 10.854f, 6.854f)
            lineTo(4.207f, 13.5f)
            lineTo(10.854f, 20.146f)
            curveTo(11.049f, 20.342f, 11.049f, 20.658f, 10.854f, 20.854f)
            curveTo(10.658f, 21.049f, 10.342f, 21.049f, 10.146f, 20.854f)
            lineTo(3.146f, 13.854f)
            curveTo(2.951f, 13.658f, 2.951f, 13.342f, 3.146f, 13.146f)
            lineTo(10.146f, 6.146f)
            curveTo(10.342f, 5.951f, 10.658f, 5.951f, 10.854f, 6.146f)
            close()
            moveTo(16.854f, 6.146f)
            curveTo(17.049f, 6.342f, 17.049f, 6.658f, 16.854f, 6.854f)
            lineTo(10.707f, 13f)
            horizontalLineTo(16.5f)
            curveTo(23.404f, 13f, 29f, 18.596f, 29f, 25.5f)
            curveTo(29f, 25.776f, 28.776f, 26f, 28.5f, 26f)
            curveTo(28.224f, 26f, 28f, 25.776f, 28f, 25.5f)
            curveTo(28f, 19.149f, 22.851f, 14f, 16.5f, 14f)
            horizontalLineTo(10.707f)
            lineTo(16.854f, 20.146f)
            curveTo(17.049f, 20.342f, 17.049f, 20.658f, 16.854f, 20.854f)
            curveTo(16.658f, 21.049f, 16.342f, 21.049f, 16.146f, 20.854f)
            lineTo(9.146f, 13.854f)
            curveTo(8.951f, 13.658f, 8.951f, 13.342f, 9.146f, 13.146f)
            lineTo(16.146f, 6.146f)
            curveTo(16.342f, 5.951f, 16.658f, 5.951f, 16.854f, 6.146f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowReplyAllPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.ArrowReplyAll, contentDescription = null)
    }
}
