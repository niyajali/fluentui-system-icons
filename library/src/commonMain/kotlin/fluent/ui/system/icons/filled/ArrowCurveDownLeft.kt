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

public val FluentUi.Filled.ArrowCurveDownLeft: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowCurveDownLeft",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16.868f, 3.254f)
            curveTo(17.142f, 3.734f, 16.976f, 4.344f, 16.496f, 4.618f)
            curveTo(14.621f, 5.69f, 13.785f, 6.981f, 13.382f, 8.314f)
            curveTo(12.994f, 9.603f, 12.997f, 10.957f, 13f, 12.376f)
            curveTo(13f, 12.5f, 13f, 12.625f, 13f, 12.75f)
            verticalLineTo(17.836f)
            lineTo(16.293f, 14.543f)
            curveTo(16.683f, 14.152f, 17.317f, 14.152f, 17.707f, 14.543f)
            curveTo(18.098f, 14.934f, 18.098f, 15.567f, 17.707f, 15.957f)
            lineTo(12.707f, 20.957f)
            curveTo(12.317f, 21.348f, 11.683f, 21.348f, 11.293f, 20.957f)
            lineTo(6.293f, 15.957f)
            curveTo(5.902f, 15.567f, 5.902f, 14.934f, 6.293f, 14.543f)
            curveTo(6.683f, 14.152f, 7.317f, 14.152f, 7.707f, 14.543f)
            lineTo(11f, 17.836f)
            verticalLineTo(12.75f)
            curveTo(11f, 12.62f, 11f, 12.486f, 10.999f, 12.35f)
            curveTo(10.994f, 10.977f, 10.988f, 9.327f, 11.468f, 7.736f)
            curveTo(12.016f, 5.919f, 13.179f, 4.211f, 15.504f, 2.882f)
            curveTo(15.983f, 2.608f, 16.594f, 2.775f, 16.868f, 3.254f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowCurveDownLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArrowCurveDownLeft, contentDescription = null)
    }
}
