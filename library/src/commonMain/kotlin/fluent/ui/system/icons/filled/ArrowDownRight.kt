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

public val FluentUi.Filled.ArrowDownRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowDownRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11f, 21f)
            curveTo(10.448f, 21f, 10f, 20.552f, 10f, 20f)
            curveTo(10f, 19.448f, 10.448f, 19f, 11f, 19f)
            horizontalLineTo(17.586f)
            lineTo(3.293f, 4.707f)
            curveTo(2.902f, 4.317f, 2.902f, 3.683f, 3.293f, 3.293f)
            curveTo(3.683f, 2.902f, 4.317f, 2.902f, 4.707f, 3.293f)
            lineTo(19f, 17.586f)
            verticalLineTo(11f)
            curveTo(19f, 10.448f, 19.448f, 10f, 20f, 10f)
            curveTo(20.552f, 10f, 21f, 10.448f, 21f, 11f)
            verticalLineTo(20f)
            curveTo(21f, 20.552f, 20.552f, 21f, 20f, 21f)
            horizontalLineTo(11f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowDownRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArrowDownRight, contentDescription = null)
    }
}
