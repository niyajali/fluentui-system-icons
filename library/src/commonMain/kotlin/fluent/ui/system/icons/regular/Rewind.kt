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

public val FluentUi.Regular.Rewind: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Rewind",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.501f, 5.503f)
            curveTo(12.501f, 4.224f, 11.003f, 3.532f, 10.028f, 4.361f)
            lineTo(2.619f, 10.667f)
            curveTo(1.798f, 11.366f, 1.798f, 12.633f, 2.619f, 13.332f)
            lineTo(10.028f, 19.638f)
            curveTo(11.003f, 20.467f, 12.501f, 19.775f, 12.501f, 18.496f)
            verticalLineTo(14.508f)
            lineTo(18.529f, 19.639f)
            curveTo(19.503f, 20.468f, 21.002f, 19.775f, 21.002f, 18.496f)
            verticalLineTo(5.504f)
            curveTo(21.002f, 4.224f, 19.503f, 3.532f, 18.529f, 4.361f)
            lineTo(12.501f, 9.492f)
            verticalLineTo(5.503f)
            close()
            moveTo(12.501f, 12.538f)
            verticalLineTo(11.462f)
            lineTo(19.502f, 5.504f)
            verticalLineTo(18.496f)
            lineTo(12.501f, 12.538f)
            close()
            moveTo(3.591f, 11.809f)
            lineTo(11.001f, 5.503f)
            verticalLineTo(18.496f)
            lineTo(3.591f, 12.19f)
            curveTo(3.474f, 12.09f, 3.474f, 11.909f, 3.591f, 11.809f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun RewindPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Rewind, contentDescription = null)
    }
}
