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

public val FluentUi.Filled.TextAddSpaceBefore: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextAddSpaceBefore",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.293f, 6.207f)
            curveTo(8.902f, 5.817f, 8.902f, 5.183f, 9.293f, 4.793f)
            curveTo(9.683f, 4.402f, 10.317f, 4.402f, 10.707f, 4.793f)
            lineTo(12f, 6.086f)
            lineTo(13.293f, 4.793f)
            curveTo(13.683f, 4.402f, 14.317f, 4.402f, 14.707f, 4.793f)
            curveTo(15.098f, 5.183f, 15.098f, 5.817f, 14.707f, 6.207f)
            lineTo(12.707f, 8.207f)
            curveTo(12.317f, 8.598f, 11.683f, 8.598f, 11.293f, 8.207f)
            lineTo(9.293f, 6.207f)
            close()
            moveTo(3f, 12f)
            curveTo(3f, 11.448f, 3.448f, 11f, 4f, 11f)
            horizontalLineTo(20f)
            curveTo(20.552f, 11f, 21f, 11.448f, 21f, 12f)
            curveTo(21f, 12.552f, 20.552f, 13f, 20f, 13f)
            horizontalLineTo(4f)
            curveTo(3.448f, 13f, 3f, 12.552f, 3f, 12f)
            close()
            moveTo(3f, 18f)
            curveTo(3f, 17.448f, 3.448f, 17f, 4f, 17f)
            horizontalLineTo(20f)
            curveTo(20.552f, 17f, 21f, 17.448f, 21f, 18f)
            curveTo(21f, 18.552f, 20.552f, 19f, 20f, 19f)
            horizontalLineTo(4f)
            curveTo(3.448f, 19f, 3f, 18.552f, 3f, 18f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextAddSpaceBeforePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextAddSpaceBefore, contentDescription = null)
    }
}
