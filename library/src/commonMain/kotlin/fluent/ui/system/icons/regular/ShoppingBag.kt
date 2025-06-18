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

public val FluentUi.Regular.ShoppingBag: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ShoppingBag",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7f, 7f)
            verticalLineTo(5f)
            curveTo(7f, 3.343f, 8.343f, 2f, 10f, 2f)
            curveTo(10.768f, 2f, 11.469f, 2.289f, 12f, 2.764f)
            curveTo(12.531f, 2.289f, 13.232f, 2f, 14f, 2f)
            curveTo(15.657f, 2f, 17f, 3.343f, 17f, 5f)
            verticalLineTo(7f)
            horizontalLineTo(18.5f)
            curveTo(19.328f, 7f, 20f, 7.672f, 20f, 8.5f)
            verticalLineTo(18.505f)
            curveTo(20f, 20.435f, 18.435f, 22f, 16.505f, 22f)
            horizontalLineTo(8f)
            curveTo(5.791f, 22f, 4f, 20.209f, 4f, 18f)
            verticalLineTo(8.5f)
            curveTo(4f, 7.672f, 4.672f, 7f, 5.5f, 7f)
            horizontalLineTo(7f)
            close()
            moveTo(13.635f, 20.5f)
            curveTo(13.241f, 19.934f, 13.01f, 19.247f, 13.01f, 18.505f)
            verticalLineTo(8.5f)
            horizontalLineTo(5.5f)
            verticalLineTo(18f)
            curveTo(5.5f, 19.381f, 6.619f, 20.5f, 8f, 20.5f)
            horizontalLineTo(13.635f)
            close()
            moveTo(11.5f, 7f)
            verticalLineTo(5f)
            curveTo(11.5f, 4.172f, 10.828f, 3.5f, 10f, 3.5f)
            curveTo(9.172f, 3.5f, 8.5f, 4.172f, 8.5f, 5f)
            verticalLineTo(7f)
            horizontalLineTo(11.5f)
            close()
            moveTo(13f, 7f)
            horizontalLineTo(15.5f)
            verticalLineTo(5f)
            curveTo(15.5f, 4.172f, 14.828f, 3.5f, 14f, 3.5f)
            curveTo(13.535f, 3.5f, 13.12f, 3.712f, 12.844f, 4.044f)
            curveTo(12.945f, 4.344f, 13f, 4.666f, 13f, 5f)
            verticalLineTo(7f)
            close()
            moveTo(14.51f, 18.505f)
            curveTo(14.51f, 19.607f, 15.403f, 20.5f, 16.505f, 20.5f)
            curveTo(17.607f, 20.5f, 18.5f, 19.607f, 18.5f, 18.505f)
            verticalLineTo(8.5f)
            horizontalLineTo(14.51f)
            verticalLineTo(18.505f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ShoppingBagPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ShoppingBag, contentDescription = null)
    }
}
