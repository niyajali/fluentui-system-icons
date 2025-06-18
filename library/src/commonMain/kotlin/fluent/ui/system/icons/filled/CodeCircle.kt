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

public val FluentUi.Filled.CodeCircle: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CodeCircle",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(22f, 12f)
            curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
            curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
            curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
            curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
            close()
            moveTo(14.939f, 7.046f)
            lineTo(10.439f, 17.546f)
            curveTo(10.276f, 17.926f, 9.835f, 18.103f, 9.455f, 17.94f)
            curveTo(9.074f, 17.776f, 8.898f, 17.336f, 9.061f, 16.955f)
            lineTo(13.56f, 6.455f)
            curveTo(13.724f, 6.074f, 14.165f, 5.898f, 14.545f, 6.061f)
            curveTo(14.926f, 6.224f, 15.102f, 6.665f, 14.939f, 7.046f)
            close()
            moveTo(8.752f, 10.307f)
            lineTo(6.871f, 12f)
            lineTo(8.752f, 13.693f)
            curveTo(9.06f, 13.97f, 9.085f, 14.444f, 8.807f, 14.752f)
            curveTo(8.53f, 15.06f, 8.056f, 15.085f, 7.748f, 14.807f)
            lineTo(5.248f, 12.557f)
            curveTo(5.09f, 12.415f, 5f, 12.213f, 5f, 12f)
            curveTo(5f, 11.787f, 5.09f, 11.585f, 5.248f, 11.443f)
            lineTo(7.748f, 9.193f)
            curveTo(8.056f, 8.915f, 8.53f, 8.94f, 8.807f, 9.248f)
            curveTo(9.085f, 9.556f, 9.06f, 10.03f, 8.752f, 10.307f)
            close()
            moveTo(15.193f, 9.248f)
            curveTo(15.47f, 8.94f, 15.944f, 8.915f, 16.252f, 9.193f)
            lineTo(18.752f, 11.443f)
            curveTo(18.91f, 11.585f, 19f, 11.787f, 19f, 12f)
            curveTo(19f, 12.213f, 18.91f, 12.415f, 18.752f, 12.557f)
            lineTo(16.252f, 14.807f)
            curveTo(15.944f, 15.085f, 15.47f, 15.06f, 15.193f, 14.752f)
            curveTo(14.915f, 14.444f, 14.94f, 13.97f, 15.248f, 13.693f)
            lineTo(17.129f, 12f)
            lineTo(15.248f, 10.307f)
            curveTo(14.94f, 10.03f, 14.915f, 9.556f, 15.193f, 9.248f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CodeCirclePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CodeCircle, contentDescription = null)
    }
}
