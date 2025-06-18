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

public val FluentUi.Filled.TextDirectionRotate45Right: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextDirectionRotate45Right",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(22f, 11.5f)
            curveTo(22f, 10.948f, 21.552f, 10.5f, 21f, 10.5f)
            curveTo(20.448f, 10.5f, 20f, 10.948f, 20f, 11.5f)
            verticalLineTo(11.586f)
            lineTo(16.957f, 8.543f)
            curveTo(16.567f, 8.152f, 15.933f, 8.152f, 15.543f, 8.543f)
            curveTo(15.152f, 8.933f, 15.152f, 9.567f, 15.543f, 9.957f)
            lineTo(18.586f, 13f)
            horizontalLineTo(18.5f)
            curveTo(17.948f, 13f, 17.5f, 13.448f, 17.5f, 14f)
            curveTo(17.5f, 14.552f, 17.948f, 15f, 18.5f, 15f)
            horizontalLineTo(21f)
            curveTo(21.552f, 15f, 22f, 14.552f, 22f, 14f)
            verticalLineTo(11.5f)
            close()
            moveTo(16.404f, 3.428f)
            curveTo(16.585f, 3.046f, 16.506f, 2.592f, 16.207f, 2.293f)
            curveTo(15.908f, 1.994f, 15.454f, 1.915f, 15.072f, 2.096f)
            lineTo(5.572f, 6.596f)
            curveTo(5.073f, 6.833f, 4.86f, 7.429f, 5.096f, 7.928f)
            curveTo(5.333f, 8.427f, 5.929f, 8.64f, 6.428f, 8.404f)
            lineTo(8.845f, 7.259f)
            lineTo(11.241f, 9.655f)
            lineTo(10.096f, 12.072f)
            curveTo(9.86f, 12.571f, 10.073f, 13.167f, 10.572f, 13.404f)
            curveTo(11.071f, 13.64f, 11.667f, 13.427f, 11.904f, 12.928f)
            lineTo(16.404f, 3.428f)
            close()
            moveTo(12.15f, 7.736f)
            lineTo(10.764f, 6.35f)
            lineTo(13.398f, 5.102f)
            lineTo(12.15f, 7.736f)
            close()
            moveTo(15f, 18.5f)
            curveTo(15f, 17.948f, 14.552f, 17.5f, 14f, 17.5f)
            curveTo(13.448f, 17.5f, 13f, 17.948f, 13f, 18.5f)
            verticalLineTo(18.586f)
            lineTo(3.707f, 9.293f)
            curveTo(3.317f, 8.902f, 2.683f, 8.902f, 2.293f, 9.293f)
            curveTo(1.902f, 9.683f, 1.902f, 10.317f, 2.293f, 10.707f)
            lineTo(11.586f, 20f)
            horizontalLineTo(11.5f)
            curveTo(10.948f, 20f, 10.5f, 20.448f, 10.5f, 21f)
            curveTo(10.5f, 21.552f, 10.948f, 22f, 11.5f, 22f)
            horizontalLineTo(14f)
            curveTo(14.552f, 22f, 15f, 21.552f, 15f, 21f)
            verticalLineTo(18.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextDirectionRotate45RightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextDirectionRotate45Right, contentDescription = null)
    }
}
