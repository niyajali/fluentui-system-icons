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

public val FluentUi.Filled.ProhibitedMultiple: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ProhibitedMultiple",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.05f, 6.05f)
            curveTo(8.544f, 3.557f, 12.451f, 3.338f, 15.193f, 5.393f)
            lineTo(5.393f, 15.193f)
            curveTo(3.338f, 12.451f, 3.557f, 8.544f, 6.05f, 6.05f)
            close()
            moveTo(6.807f, 16.607f)
            lineTo(16.607f, 6.807f)
            curveTo(18.662f, 9.549f, 18.443f, 13.456f, 15.95f, 15.95f)
            curveTo(13.456f, 18.443f, 9.549f, 18.662f, 6.807f, 16.607f)
            close()
            moveTo(17.364f, 4.636f)
            curveTo(13.849f, 1.121f, 8.151f, 1.121f, 4.636f, 4.636f)
            curveTo(1.121f, 8.151f, 1.121f, 13.849f, 4.636f, 17.364f)
            curveTo(8.151f, 20.879f, 13.849f, 20.879f, 17.364f, 17.364f)
            curveTo(20.879f, 13.849f, 20.879f, 8.151f, 17.364f, 4.636f)
            close()
            moveTo(21f, 11f)
            curveTo(21f, 16.523f, 16.523f, 21f, 11f, 21f)
            curveTo(10.016f, 21f, 9.064f, 20.858f, 8.166f, 20.593f)
            curveTo(9.562f, 21.484f, 11.221f, 22f, 13f, 22f)
            curveTo(17.971f, 22f, 22f, 17.971f, 22f, 13f)
            curveTo(22f, 11.221f, 21.484f, 9.562f, 20.593f, 8.165f)
            curveTo(20.858f, 9.064f, 21f, 10.016f, 21f, 11f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ProhibitedMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ProhibitedMultiple, contentDescription = null)
    }
}
