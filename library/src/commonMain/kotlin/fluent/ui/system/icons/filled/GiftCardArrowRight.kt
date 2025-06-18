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

public val FluentUi.Filled.GiftCardArrowRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.GiftCardArrowRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8f, 2f)
            horizontalLineTo(5f)
            curveTo(3.343f, 2f, 2f, 3.343f, 2f, 5f)
            verticalLineTo(8f)
            horizontalLineTo(4.708f)
            curveTo(4.574f, 7.694f, 4.5f, 7.356f, 4.5f, 7f)
            curveTo(4.5f, 5.619f, 5.619f, 4.5f, 7f, 4.5f)
            curveTo(7.356f, 4.5f, 7.694f, 4.574f, 8f, 4.708f)
            verticalLineTo(2f)
            close()
            moveTo(2f, 9.5f)
            verticalLineTo(14f)
            curveTo(2f, 15.657f, 3.343f, 17f, 5f, 17f)
            horizontalLineTo(8f)
            verticalLineTo(10.561f)
            lineTo(6.28f, 12.28f)
            curveTo(5.987f, 12.573f, 5.513f, 12.573f, 5.22f, 12.28f)
            curveTo(4.927f, 11.987f, 4.927f, 11.513f, 5.22f, 11.22f)
            lineTo(6.939f, 9.5f)
            horizontalLineTo(2f)
            close()
            moveTo(9.5f, 17f)
            horizontalLineTo(11.019f)
            curveTo(11.274f, 13.644f, 14.078f, 11f, 17.5f, 11f)
            curveTo(19.247f, 11f, 20.832f, 11.689f, 22f, 12.81f)
            verticalLineTo(9.5f)
            horizontalLineTo(10.561f)
            lineTo(12.28f, 11.22f)
            curveTo(12.573f, 11.513f, 12.573f, 11.987f, 12.28f, 12.28f)
            curveTo(11.987f, 12.573f, 11.513f, 12.573f, 11.22f, 12.28f)
            lineTo(9.5f, 10.561f)
            verticalLineTo(17f)
            close()
            moveTo(22f, 8f)
            horizontalLineTo(12.792f)
            curveTo(12.926f, 7.694f, 13f, 7.356f, 13f, 7f)
            curveTo(13f, 5.619f, 11.881f, 4.5f, 10.5f, 4.5f)
            curveTo(10.144f, 4.5f, 9.806f, 4.574f, 9.5f, 4.708f)
            verticalLineTo(2f)
            horizontalLineTo(19f)
            curveTo(20.657f, 2f, 22f, 3.343f, 22f, 5f)
            verticalLineTo(8f)
            close()
            moveTo(10.5f, 8f)
            horizontalLineTo(9.5f)
            verticalLineTo(7f)
            curveTo(9.5f, 6.448f, 9.948f, 6f, 10.5f, 6f)
            curveTo(11.052f, 6f, 11.5f, 6.448f, 11.5f, 7f)
            curveTo(11.5f, 7.552f, 11.052f, 8f, 10.5f, 8f)
            close()
            moveTo(8f, 8f)
            horizontalLineTo(7f)
            curveTo(6.448f, 8f, 6f, 7.552f, 6f, 7f)
            curveTo(6f, 6.448f, 6.448f, 6f, 7f, 6f)
            curveTo(7.55f, 6f, 7.996f, 6.444f, 8f, 6.992f)
            verticalLineTo(8f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            close()
            moveTo(14.5f, 17f)
            curveTo(14.224f, 17f, 14f, 17.224f, 14f, 17.5f)
            curveTo(14f, 17.776f, 14.224f, 18f, 14.5f, 18f)
            horizontalLineTo(19.293f)
            lineTo(17.646f, 19.646f)
            curveTo(17.451f, 19.842f, 17.451f, 20.158f, 17.646f, 20.354f)
            curveTo(17.842f, 20.549f, 18.158f, 20.549f, 18.354f, 20.354f)
            lineTo(20.854f, 17.854f)
            curveTo(21.049f, 17.658f, 21.049f, 17.342f, 20.854f, 17.146f)
            lineTo(18.354f, 14.646f)
            curveTo(18.158f, 14.451f, 17.842f, 14.451f, 17.646f, 14.646f)
            curveTo(17.451f, 14.842f, 17.451f, 15.158f, 17.646f, 15.354f)
            lineTo(19.293f, 17f)
            horizontalLineTo(14.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun GiftCardArrowRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.GiftCardArrowRight, contentDescription = null)
    }
}
