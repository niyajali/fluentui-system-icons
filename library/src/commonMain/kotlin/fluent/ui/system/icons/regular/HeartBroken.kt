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

public val FluentUi.Regular.HeartBroken: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.HeartBroken",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.999f, 5.753f)
            lineTo(12.82f, 4.931f)
            curveTo(14.923f, 2.828f, 18.328f, 2.828f, 20.431f, 4.931f)
            curveTo(22.53f, 7.03f, 22.526f, 10.424f, 20.432f, 12.53f)
            lineTo(12.531f, 20.427f)
            curveTo(12.238f, 20.72f, 11.763f, 20.72f, 11.47f, 20.427f)
            lineTo(3.575f, 12.531f)
            curveTo(1.475f, 10.432f, 1.475f, 7.029f, 3.575f, 4.93f)
            curveTo(5.674f, 2.831f, 9.077f, 2.831f, 11.176f, 4.93f)
            lineTo(11.999f, 5.753f)
            close()
            moveTo(12f, 18.836f)
            lineTo(19.368f, 11.472f)
            curveTo(20.881f, 9.951f, 20.884f, 7.505f, 19.37f, 5.991f)
            curveTo(17.92f, 4.541f, 15.612f, 4.477f, 14.087f, 5.8f)
            curveTo(14.083f, 5.803f, 14.08f, 5.807f, 14.076f, 5.81f)
            lineTo(13.069f, 6.809f)
            lineTo(12.546f, 7.335f)
            curveTo(12.519f, 7.364f, 12.489f, 7.39f, 12.459f, 7.414f)
            lineTo(11.222f, 8.639f)
            lineTo(14.018f, 11.31f)
            curveTo(14.164f, 11.45f, 14.248f, 11.642f, 14.25f, 11.844f)
            curveTo(14.252f, 12.046f, 14.173f, 12.24f, 14.03f, 12.383f)
            lineTo(11.53f, 14.883f)
            curveTo(11.237f, 15.176f, 10.762f, 15.176f, 10.469f, 14.883f)
            curveTo(10.177f, 14.59f, 10.177f, 14.115f, 10.47f, 13.822f)
            lineTo(12.427f, 11.865f)
            lineTo(9.629f, 9.192f)
            curveTo(9.483f, 9.052f, 9.399f, 8.859f, 9.397f, 8.656f)
            curveTo(9.395f, 8.454f, 9.475f, 8.259f, 9.619f, 8.117f)
            lineTo(10.936f, 6.811f)
            lineTo(10.115f, 5.991f)
            curveTo(8.602f, 4.477f, 6.148f, 4.477f, 4.635f, 5.991f)
            curveTo(3.122f, 7.504f, 3.122f, 9.957f, 4.635f, 11.471f)
            lineTo(12f, 18.836f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HeartBrokenPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.HeartBroken, contentDescription = null)
    }
}
