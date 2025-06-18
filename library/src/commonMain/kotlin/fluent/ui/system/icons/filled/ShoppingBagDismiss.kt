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

public val FluentUi.Filled.ShoppingBagDismiss: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShoppingBagDismiss",
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
            verticalLineTo(11.498f)
            curveTo(19.23f, 11.177f, 18.386f, 11f, 17.5f, 11f)
            curveTo(16.418f, 11f, 15.398f, 11.264f, 14.5f, 11.732f)
            verticalLineTo(7f)
            horizontalLineTo(15.5f)
            verticalLineTo(5f)
            curveTo(15.5f, 4.172f, 14.828f, 3.5f, 14f, 3.5f)
            curveTo(13.535f, 3.5f, 13.12f, 3.712f, 12.844f, 4.044f)
            curveTo(12.945f, 4.344f, 13f, 4.666f, 13f, 5f)
            verticalLineTo(12.81f)
            curveTo(11.767f, 13.993f, 11f, 15.657f, 11f, 17.5f)
            curveTo(11f, 19.247f, 11.689f, 20.832f, 12.81f, 22f)
            horizontalLineTo(8f)
            curveTo(5.791f, 22f, 4f, 20.209f, 4f, 18f)
            verticalLineTo(8.5f)
            curveTo(4f, 7.672f, 4.672f, 7f, 5.5f, 7f)
            horizontalLineTo(7f)
            close()
            moveTo(8.5f, 5f)
            verticalLineTo(7f)
            horizontalLineTo(11.5f)
            verticalLineTo(5f)
            curveTo(11.5f, 4.172f, 10.828f, 3.5f, 10f, 3.5f)
            curveTo(9.172f, 3.5f, 8.5f, 4.172f, 8.5f, 5f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            close()
            moveTo(15.854f, 15.146f)
            curveTo(15.658f, 14.951f, 15.342f, 14.951f, 15.146f, 15.146f)
            curveTo(14.951f, 15.342f, 14.951f, 15.658f, 15.146f, 15.854f)
            lineTo(16.793f, 17.5f)
            lineTo(15.146f, 19.146f)
            curveTo(14.951f, 19.342f, 14.951f, 19.658f, 15.146f, 19.854f)
            curveTo(15.342f, 20.049f, 15.658f, 20.049f, 15.854f, 19.854f)
            lineTo(17.5f, 18.207f)
            lineTo(19.146f, 19.854f)
            curveTo(19.342f, 20.049f, 19.658f, 20.049f, 19.854f, 19.854f)
            curveTo(20.049f, 19.658f, 20.049f, 19.342f, 19.854f, 19.146f)
            lineTo(18.207f, 17.5f)
            lineTo(19.854f, 15.854f)
            curveTo(20.049f, 15.658f, 20.049f, 15.342f, 19.854f, 15.146f)
            curveTo(19.658f, 14.951f, 19.342f, 14.951f, 19.146f, 15.146f)
            lineTo(17.5f, 16.793f)
            lineTo(15.854f, 15.146f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ShoppingBagDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ShoppingBagDismiss, contentDescription = null)
    }
}
