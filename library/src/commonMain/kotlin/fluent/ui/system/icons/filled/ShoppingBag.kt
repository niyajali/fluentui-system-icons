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

public val FluentUi.Filled.ShoppingBag: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShoppingBag",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7f, 5f)
            verticalLineTo(7f)
            horizontalLineTo(5.5f)
            curveTo(4.672f, 7f, 4f, 7.672f, 4f, 8.5f)
            verticalLineTo(18f)
            curveTo(4f, 20.209f, 5.791f, 22f, 8f, 22f)
            horizontalLineTo(14.009f)
            curveTo(13.38f, 21.259f, 13f, 20.299f, 13f, 19.25f)
            verticalLineTo(5f)
            curveTo(13f, 4.666f, 12.945f, 4.344f, 12.844f, 4.044f)
            curveTo(13.12f, 3.712f, 13.535f, 3.5f, 14f, 3.5f)
            curveTo(14.828f, 3.5f, 15.5f, 4.172f, 15.5f, 5f)
            verticalLineTo(7f)
            horizontalLineTo(14.5f)
            verticalLineTo(19.25f)
            curveTo(14.5f, 20.769f, 15.731f, 22f, 17.25f, 22f)
            curveTo(18.769f, 22f, 20f, 20.769f, 20f, 19.25f)
            verticalLineTo(8.5f)
            curveTo(20f, 7.672f, 19.328f, 7f, 18.5f, 7f)
            horizontalLineTo(17f)
            verticalLineTo(5f)
            curveTo(17f, 3.343f, 15.657f, 2f, 14f, 2f)
            curveTo(13.232f, 2f, 12.531f, 2.289f, 12f, 2.764f)
            curveTo(11.469f, 2.289f, 10.768f, 2f, 10f, 2f)
            curveTo(8.343f, 2f, 7f, 3.343f, 7f, 5f)
            close()
            moveTo(8.5f, 5f)
            curveTo(8.5f, 4.172f, 9.172f, 3.5f, 10f, 3.5f)
            curveTo(10.828f, 3.5f, 11.5f, 4.172f, 11.5f, 5f)
            verticalLineTo(7f)
            horizontalLineTo(8.5f)
            verticalLineTo(5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ShoppingBagPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ShoppingBag, contentDescription = null)
    }
}
