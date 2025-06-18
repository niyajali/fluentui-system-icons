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

public val FluentUi.Filled.TextBulletListLtr: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextBulletListLtr",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.499f, 16.501f)
            curveTo(4.328f, 16.501f, 4.999f, 17.172f, 4.999f, 18f)
            curveTo(4.999f, 18.828f, 4.328f, 19.499f, 3.499f, 19.499f)
            curveTo(2.671f, 19.499f, 2f, 18.828f, 2f, 18f)
            curveTo(2f, 17.172f, 2.671f, 16.501f, 3.499f, 16.501f)
            close()
            moveTo(7.5f, 17f)
            horizontalLineTo(21.003f)
            curveTo(21.556f, 17f, 22.003f, 17.448f, 22.003f, 18f)
            curveTo(22.003f, 18.513f, 21.617f, 18.935f, 21.12f, 18.993f)
            lineTo(21.003f, 19f)
            horizontalLineTo(7.5f)
            curveTo(6.948f, 19f, 6.5f, 18.552f, 6.5f, 18f)
            curveTo(6.5f, 17.487f, 6.886f, 17.065f, 7.384f, 17.007f)
            lineTo(7.5f, 17f)
            horizontalLineTo(21.003f)
            horizontalLineTo(7.5f)
            close()
            moveTo(3.499f, 10.501f)
            curveTo(4.328f, 10.501f, 4.999f, 11.172f, 4.999f, 12f)
            curveTo(4.999f, 12.828f, 4.328f, 13.499f, 3.499f, 13.499f)
            curveTo(2.671f, 13.499f, 2f, 12.828f, 2f, 12f)
            curveTo(2f, 11.172f, 2.671f, 10.501f, 3.499f, 10.501f)
            close()
            moveTo(7.5f, 11f)
            horizontalLineTo(21.003f)
            curveTo(21.556f, 11f, 22.003f, 11.448f, 22.003f, 12f)
            curveTo(22.003f, 12.513f, 21.617f, 12.936f, 21.12f, 12.993f)
            lineTo(21.003f, 13f)
            horizontalLineTo(7.5f)
            curveTo(6.948f, 13f, 6.5f, 12.552f, 6.5f, 12f)
            curveTo(6.5f, 11.487f, 6.886f, 11.064f, 7.384f, 11.007f)
            lineTo(7.5f, 11f)
            horizontalLineTo(21.003f)
            horizontalLineTo(7.5f)
            close()
            moveTo(3.499f, 4.508f)
            curveTo(4.328f, 4.508f, 4.999f, 5.179f, 4.999f, 6.007f)
            curveTo(4.999f, 6.835f, 4.328f, 7.507f, 3.499f, 7.507f)
            curveTo(2.671f, 7.507f, 2f, 6.835f, 2f, 6.007f)
            curveTo(2f, 5.179f, 2.671f, 4.508f, 3.499f, 4.508f)
            close()
            moveTo(7.5f, 5.001f)
            horizontalLineTo(21.003f)
            curveTo(21.556f, 5.001f, 22.003f, 5.449f, 22.003f, 6.001f)
            curveTo(22.003f, 6.514f, 21.617f, 6.936f, 21.12f, 6.994f)
            lineTo(21.003f, 7.001f)
            horizontalLineTo(7.5f)
            curveTo(6.948f, 7.001f, 6.5f, 6.553f, 6.5f, 6.001f)
            curveTo(6.5f, 5.488f, 6.886f, 5.065f, 7.384f, 5.008f)
            lineTo(7.5f, 5.001f)
            horizontalLineTo(21.003f)
            horizontalLineTo(7.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextBulletListLtrPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextBulletListLtr, contentDescription = null)
    }
}
