package fluent.ui.system.icons.colored

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Colored.GiftCard: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.GiftCard",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFFCECECE))) {
            moveTo(5.25f, 4f)
            curveTo(3.455f, 4f, 2f, 5.455f, 2f, 7.25f)
            verticalLineTo(15.75f)
            curveTo(2f, 17.545f, 3.455f, 19f, 5.25f, 19f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 19f, 22f, 17.545f, 22f, 15.75f)
            verticalLineTo(7.25f)
            curveTo(22f, 5.455f, 20.545f, 4f, 18.75f, 4f)
            horizontalLineTo(5.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125f to Color(0xFFBB45EA),
                    0.468f to Color(0xFF8B57ED),
                    1f to Color(0xFF5B2AB5)
                ),
                start = Offset(2f, -0.688f),
                end = Offset(14.41f, 24.366f)
            )
        ) {
            moveTo(5.25f, 4f)
            curveTo(3.455f, 4f, 2f, 5.455f, 2f, 7.25f)
            verticalLineTo(15.75f)
            curveTo(2f, 17.545f, 3.455f, 19f, 5.25f, 19f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 19f, 22f, 17.545f, 22f, 15.75f)
            verticalLineTo(7.25f)
            curveTo(22f, 5.455f, 20.545f, 4f, 18.75f, 4f)
            horizontalLineTo(5.25f)
            close()
        }
        path(fill = SolidColor(Color(0xFF000000))) {
            moveTo(7.986f, 10f)
            lineTo(8f, 3.998f)
            lineTo(9.5f, 4.002f)
            lineTo(9.486f, 10f)
            horizontalLineTo(22f)
            verticalLineTo(11.5f)
            horizontalLineTo(9.482f)
            lineTo(9.465f, 19.002f)
            lineTo(7.965f, 18.998f)
            lineTo(7.982f, 11.5f)
            horizontalLineTo(2f)
            verticalLineTo(10f)
            horizontalLineTo(7.986f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFB5937),
                    0.378f to Color(0xFFFFCD0F)
                ),
                center = Offset(9.5f, 11.5f),
                radius = 25.625f
            )
        ) {
            moveTo(7.986f, 10f)
            lineTo(8f, 3.998f)
            lineTo(9.5f, 4.002f)
            lineTo(9.486f, 10f)
            horizontalLineTo(22f)
            verticalLineTo(11.5f)
            horizontalLineTo(9.482f)
            lineTo(9.465f, 19.002f)
            lineTo(7.965f, 18.998f)
            lineTo(7.982f, 11.5f)
            horizontalLineTo(2f)
            verticalLineTo(10f)
            horizontalLineTo(7.986f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF515151)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(6.94f, 11.499f)
            curveTo(5.587f, 11.467f, 4.5f, 10.361f, 4.5f, 9f)
            curveTo(4.5f, 7.619f, 5.619f, 6.5f, 7f, 6.5f)
            curveTo(7.681f, 6.5f, 8.299f, 6.773f, 8.75f, 7.215f)
            curveTo(9.201f, 6.773f, 9.819f, 6.5f, 10.5f, 6.5f)
            curveTo(11.881f, 6.5f, 13f, 7.619f, 13f, 9f)
            curveTo(13f, 10.361f, 11.913f, 11.467f, 10.56f, 11.499f)
            lineTo(12.28f, 13.22f)
            curveTo(12.573f, 13.513f, 12.573f, 13.987f, 12.28f, 14.28f)
            curveTo(11.987f, 14.573f, 11.513f, 14.573f, 11.22f, 14.28f)
            lineTo(8.75f, 11.811f)
            lineTo(6.28f, 14.28f)
            curveTo(5.987f, 14.573f, 5.513f, 14.573f, 5.22f, 14.28f)
            curveTo(4.927f, 13.987f, 4.927f, 13.513f, 5.22f, 13.22f)
            lineTo(6.94f, 11.499f)
            close()
            moveTo(7f, 8f)
            curveTo(6.448f, 8f, 6f, 8.448f, 6f, 9f)
            curveTo(6f, 9.552f, 6.448f, 10f, 7f, 10f)
            horizontalLineTo(8f)
            verticalLineTo(9f)
            curveTo(8f, 8.448f, 7.552f, 8f, 7f, 8f)
            close()
            moveTo(10.5f, 10f)
            horizontalLineTo(9.5f)
            verticalLineTo(9f)
            curveTo(9.5f, 8.448f, 9.948f, 8f, 10.5f, 8f)
            curveTo(11.052f, 8f, 11.5f, 8.448f, 11.5f, 9f)
            curveTo(11.5f, 9.552f, 11.052f, 10f, 10.5f, 10f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF6F47),
                    0.804f to Color(0xFFFFCD0F)
                ),
                start = Offset(9.033f, -16.928f),
                end = Offset(8.457f, 23.071f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(6.94f, 11.499f)
            curveTo(5.587f, 11.467f, 4.5f, 10.361f, 4.5f, 9f)
            curveTo(4.5f, 7.619f, 5.619f, 6.5f, 7f, 6.5f)
            curveTo(7.681f, 6.5f, 8.299f, 6.773f, 8.75f, 7.215f)
            curveTo(9.201f, 6.773f, 9.819f, 6.5f, 10.5f, 6.5f)
            curveTo(11.881f, 6.5f, 13f, 7.619f, 13f, 9f)
            curveTo(13f, 10.361f, 11.913f, 11.467f, 10.56f, 11.499f)
            lineTo(12.28f, 13.22f)
            curveTo(12.573f, 13.513f, 12.573f, 13.987f, 12.28f, 14.28f)
            curveTo(11.987f, 14.573f, 11.513f, 14.573f, 11.22f, 14.28f)
            lineTo(8.75f, 11.811f)
            lineTo(6.28f, 14.28f)
            curveTo(5.987f, 14.573f, 5.513f, 14.573f, 5.22f, 14.28f)
            curveTo(4.927f, 13.987f, 4.927f, 13.513f, 5.22f, 13.22f)
            lineTo(6.94f, 11.499f)
            close()
            moveTo(7f, 8f)
            curveTo(6.448f, 8f, 6f, 8.448f, 6f, 9f)
            curveTo(6f, 9.552f, 6.448f, 10f, 7f, 10f)
            horizontalLineTo(8f)
            verticalLineTo(9f)
            curveTo(8f, 8.448f, 7.552f, 8f, 7f, 8f)
            close()
            moveTo(10.5f, 10f)
            horizontalLineTo(9.5f)
            verticalLineTo(9f)
            curveTo(9.5f, 8.448f, 9.948f, 8f, 10.5f, 8f)
            curveTo(11.052f, 8f, 11.5f, 8.448f, 11.5f, 9f)
            curveTo(11.5f, 9.552f, 11.052f, 10f, 10.5f, 10f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun GiftCardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.GiftCard, contentDescription = null)
    }
}
