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

public val FluentUi.Filled.TabGroup: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TabGroup",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.75f, 5f)
            curveTo(3.231f, 5f, 2f, 6.231f, 2f, 7.75f)
            verticalLineTo(13.25f)
            curveTo(2f, 14.769f, 3.231f, 16f, 4.75f, 16f)
            horizontalLineTo(17.25f)
            curveTo(18.769f, 16f, 20f, 14.769f, 20f, 13.25f)
            verticalLineTo(7.75f)
            curveTo(20f, 6.231f, 18.769f, 5f, 17.25f, 5f)
            horizontalLineTo(4.75f)
            close()
            moveTo(6.5f, 10.5f)
            curveTo(6.5f, 10.086f, 6.836f, 9.75f, 7.25f, 9.75f)
            horizontalLineTo(14.75f)
            curveTo(15.164f, 9.75f, 15.5f, 10.086f, 15.5f, 10.5f)
            curveTo(15.5f, 10.914f, 15.164f, 11.25f, 14.75f, 11.25f)
            horizontalLineTo(7.25f)
            curveTo(6.836f, 11.25f, 6.5f, 10.914f, 6.5f, 10.5f)
            close()
            moveTo(7.247f, 18.499f)
            curveTo(6.178f, 18.499f, 5.252f, 17.89f, 4.797f, 17f)
            horizontalLineTo(17.25f)
            curveTo(19.321f, 17f, 21f, 15.321f, 21f, 13.25f)
            verticalLineTo(7.801f)
            curveTo(21.889f, 8.257f, 22.497f, 9.182f, 22.497f, 10.249f)
            verticalLineTo(13.249f)
            curveTo(22.497f, 16.149f, 20.146f, 18.499f, 17.247f, 18.499f)
            horizontalLineTo(7.247f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TabGroupPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TabGroup, contentDescription = null)
    }
}
