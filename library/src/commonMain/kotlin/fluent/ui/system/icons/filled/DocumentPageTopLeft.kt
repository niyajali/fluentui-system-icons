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

public val FluentUi.Filled.DocumentPageTopLeft: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentPageTopLeft",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.256f, 8.999f)
            lineTo(9.494f, 7.499f)
            horizontalLineTo(10.975f)
            lineTo(10.738f, 8.999f)
            horizontalLineTo(9.256f)
            close()
            moveTo(17.75f, 2f)
            curveTo(18.941f, 2f, 19.916f, 2.925f, 19.995f, 4.096f)
            lineTo(20f, 4.25f)
            verticalLineTo(19.748f)
            curveTo(20f, 20.939f, 19.075f, 21.914f, 17.904f, 21.993f)
            lineTo(17.75f, 21.998f)
            horizontalLineTo(6.25f)
            curveTo(5.059f, 21.998f, 4.084f, 21.073f, 4.005f, 19.902f)
            lineTo(4f, 19.748f)
            verticalLineTo(4.25f)
            curveTo(4f, 3.059f, 4.925f, 2.084f, 6.096f, 2.005f)
            lineTo(6.25f, 2f)
            horizontalLineTo(17.75f)
            close()
            moveTo(10.395f, 11.16f)
            curveTo(10.331f, 11.569f, 10.61f, 11.953f, 11.019f, 12.018f)
            curveTo(11.428f, 12.083f, 11.812f, 11.804f, 11.877f, 11.394f)
            lineTo(12.019f, 10.499f)
            horizontalLineTo(12.75f)
            curveTo(13.164f, 10.499f, 13.5f, 10.163f, 13.5f, 9.749f)
            curveTo(13.5f, 9.335f, 13.164f, 8.999f, 12.75f, 8.999f)
            horizontalLineTo(12.256f)
            lineTo(12.494f, 7.499f)
            horizontalLineTo(13.25f)
            curveTo(13.664f, 7.499f, 14f, 7.163f, 14f, 6.749f)
            curveTo(14f, 6.335f, 13.664f, 5.999f, 13.25f, 5.999f)
            horizontalLineTo(12.731f)
            lineTo(12.893f, 4.974f)
            curveTo(12.958f, 4.565f, 12.679f, 4.181f, 12.27f, 4.116f)
            curveTo(11.861f, 4.052f, 11.477f, 4.331f, 11.412f, 4.74f)
            lineTo(11.212f, 5.999f)
            horizontalLineTo(9.731f)
            lineTo(9.893f, 4.974f)
            curveTo(9.958f, 4.565f, 9.679f, 4.181f, 9.27f, 4.116f)
            curveTo(8.861f, 4.052f, 8.477f, 4.331f, 8.412f, 4.74f)
            lineTo(8.213f, 5.999f)
            horizontalLineTo(7.25f)
            curveTo(6.836f, 5.999f, 6.5f, 6.335f, 6.5f, 6.749f)
            curveTo(6.5f, 7.163f, 6.836f, 7.499f, 7.25f, 7.499f)
            horizontalLineTo(7.975f)
            lineTo(7.738f, 8.999f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 8.999f, 6f, 9.335f, 6f, 9.749f)
            curveTo(6f, 10.163f, 6.336f, 10.499f, 6.75f, 10.499f)
            horizontalLineTo(7.5f)
            lineTo(7.395f, 11.16f)
            curveTo(7.331f, 11.569f, 7.61f, 11.953f, 8.019f, 12.018f)
            curveTo(8.428f, 12.083f, 8.812f, 11.804f, 8.877f, 11.394f)
            lineTo(9.019f, 10.499f)
            horizontalLineTo(10.5f)
            lineTo(10.395f, 11.16f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentPageTopLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DocumentPageTopLeft, contentDescription = null)
    }
}
