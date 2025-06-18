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

public val FluentUi.Filled.Tag: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Tag",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19.75f, 2f)
            curveTo(20.993f, 2f, 22f, 3.007f, 22f, 4.25f)
            verticalLineTo(9.712f)
            curveTo(22f, 10.574f, 21.657f, 11.4f, 21.048f, 12.01f)
            lineTo(12.547f, 20.513f)
            curveTo(11.278f, 21.78f, 9.222f, 21.781f, 7.951f, 20.514f)
            lineTo(3.489f, 16.059f)
            curveTo(2.219f, 14.791f, 2.217f, 12.733f, 3.485f, 11.463f)
            lineTo(11.985f, 2.953f)
            curveTo(12.595f, 2.343f, 13.422f, 2f, 14.285f, 2f)
            horizontalLineTo(19.75f)
            close()
            moveTo(17f, 5.502f)
            curveTo(16.171f, 5.502f, 15.5f, 6.174f, 15.5f, 7.002f)
            curveTo(15.5f, 7.831f, 16.171f, 8.502f, 17f, 8.502f)
            curveTo(17.828f, 8.502f, 18.5f, 7.831f, 18.5f, 7.002f)
            curveTo(18.5f, 6.174f, 17.828f, 5.502f, 17f, 5.502f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TagPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Tag, contentDescription = null)
    }
}
