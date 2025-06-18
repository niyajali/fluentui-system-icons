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

public val FluentUi.Regular.DividerShort: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DividerShort",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.25f, 4.75f)
            verticalLineTo(19.25f)
            curveTo(11.25f, 19.664f, 11.586f, 20f, 12f, 20f)
            curveTo(12.414f, 20f, 12.75f, 19.664f, 12.75f, 19.25f)
            verticalLineTo(4.75f)
            curveTo(12.75f, 4.336f, 12.414f, 4f, 12f, 4f)
            curveTo(11.586f, 4f, 11.25f, 4.336f, 11.25f, 4.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DividerShortPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DividerShort, contentDescription = null)
    }
}
