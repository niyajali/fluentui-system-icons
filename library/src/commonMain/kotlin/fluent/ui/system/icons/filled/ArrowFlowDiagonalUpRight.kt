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

public val FluentUi.Filled.ArrowFlowDiagonalUpRight: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowFlowDiagonalUpRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.75f, 4f)
            curveTo(12.336f, 4f, 12f, 4.336f, 12f, 4.75f)
            curveTo(12f, 5.164f, 12.336f, 5.5f, 12.75f, 5.5f)
            horizontalLineTo(17.439f)
            lineTo(9.248f, 13.691f)
            curveTo(8.608f, 13.255f, 7.834f, 13f, 7f, 13f)
            curveTo(4.791f, 13f, 3f, 14.791f, 3f, 17f)
            curveTo(3f, 19.209f, 4.791f, 21f, 7f, 21f)
            curveTo(9.209f, 21f, 11f, 19.209f, 11f, 17f)
            curveTo(11f, 16.167f, 10.745f, 15.392f, 10.309f, 14.752f)
            lineTo(18.5f, 6.561f)
            verticalLineTo(11.25f)
            curveTo(18.5f, 11.664f, 18.836f, 12f, 19.25f, 12f)
            curveTo(19.664f, 12f, 20f, 11.664f, 20f, 11.25f)
            verticalLineTo(4.75f)
            curveTo(20f, 4.336f, 19.664f, 4f, 19.25f, 4f)
            horizontalLineTo(12.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowFlowDiagonalUpRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArrowFlowDiagonalUpRight, contentDescription = null)
    }
}
