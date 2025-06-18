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

public val FluentUi.Filled.GiftCard: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.GiftCard",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.5f, 19f)
            horizontalLineTo(19f)
            curveTo(20.657f, 19f, 22f, 17.657f, 22f, 16f)
            verticalLineTo(11.5f)
            horizontalLineTo(10.561f)
            lineTo(12.28f, 13.22f)
            curveTo(12.573f, 13.513f, 12.573f, 13.987f, 12.28f, 14.28f)
            curveTo(11.987f, 14.573f, 11.513f, 14.573f, 11.22f, 14.28f)
            lineTo(9.5f, 12.561f)
            lineTo(9.5f, 19f)
            close()
            moveTo(8f, 10f)
            verticalLineTo(9f)
            curveTo(8f, 9f, 8f, 9f, 8f, 9f)
            curveTo(8f, 8.448f, 7.552f, 8f, 7f, 8f)
            curveTo(6.448f, 8f, 6f, 8.448f, 6f, 9f)
            curveTo(6f, 9.552f, 6.448f, 10f, 7f, 10f)
            horizontalLineTo(8f)
            close()
            moveTo(9.5f, 9f)
            verticalLineTo(10f)
            horizontalLineTo(10.5f)
            curveTo(11.052f, 10f, 11.5f, 9.552f, 11.5f, 9f)
            curveTo(11.5f, 8.448f, 11.052f, 8f, 10.5f, 8f)
            curveTo(9.948f, 8f, 9.5f, 8.448f, 9.5f, 9f)
            close()
            moveTo(9.5f, 6.708f)
            verticalLineTo(4f)
            horizontalLineTo(19f)
            curveTo(20.657f, 4f, 22f, 5.343f, 22f, 7f)
            verticalLineTo(10f)
            horizontalLineTo(12.792f)
            curveTo(12.926f, 9.694f, 13f, 9.356f, 13f, 9f)
            curveTo(13f, 7.619f, 11.881f, 6.5f, 10.5f, 6.5f)
            curveTo(10.144f, 6.5f, 9.806f, 6.574f, 9.5f, 6.708f)
            close()
            moveTo(8f, 4f)
            verticalLineTo(6.708f)
            curveTo(7.694f, 6.574f, 7.356f, 6.5f, 7f, 6.5f)
            curveTo(5.619f, 6.5f, 4.5f, 7.619f, 4.5f, 9f)
            curveTo(4.5f, 9.356f, 4.574f, 9.694f, 4.708f, 10f)
            horizontalLineTo(2f)
            verticalLineTo(7f)
            curveTo(2f, 5.343f, 3.343f, 4f, 5f, 4f)
            horizontalLineTo(8f)
            close()
            moveTo(8f, 12.561f)
            lineTo(8f, 19f)
            horizontalLineTo(5f)
            curveTo(3.343f, 19f, 2f, 17.657f, 2f, 16f)
            verticalLineTo(11.5f)
            horizontalLineTo(6.939f)
            lineTo(5.22f, 13.22f)
            curveTo(4.927f, 13.513f, 4.927f, 13.987f, 5.22f, 14.28f)
            curveTo(5.513f, 14.573f, 5.987f, 14.573f, 6.28f, 14.28f)
            lineTo(8f, 12.561f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun GiftCardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.GiftCard, contentDescription = null)
    }
}
