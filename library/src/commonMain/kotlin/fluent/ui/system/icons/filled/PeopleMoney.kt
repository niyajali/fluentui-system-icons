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

public val FluentUi.Filled.PeopleMoney: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PeopleMoney",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8f, 11f)
            curveTo(10.209f, 11f, 12f, 9.209f, 12f, 7f)
            curveTo(12f, 4.791f, 10.209f, 3f, 8f, 3f)
            curveTo(5.791f, 3f, 4f, 4.791f, 4f, 7f)
            curveTo(4f, 9.209f, 5.791f, 11f, 8f, 11f)
            close()
            moveTo(17f, 11f)
            curveTo(18.657f, 11f, 20f, 9.657f, 20f, 8f)
            curveTo(20f, 6.343f, 18.657f, 5f, 17f, 5f)
            curveTo(15.343f, 5f, 14f, 6.343f, 14f, 8f)
            curveTo(14f, 9.657f, 15.343f, 11f, 17f, 11f)
            close()
            moveTo(4.25f, 13f)
            curveTo(3.007f, 13f, 2f, 14.007f, 2f, 15.25f)
            verticalLineTo(15.5f)
            curveTo(2f, 15.5f, 2f, 20f, 8f, 20f)
            curveTo(9.238f, 20f, 10.22f, 19.809f, 11f, 19.504f)
            lineTo(11f, 19.5f)
            verticalLineTo(15.5f)
            curveTo(11f, 14.436f, 11.665f, 13.528f, 12.601f, 13.167f)
            curveTo(12.339f, 13.059f, 12.051f, 13f, 11.75f, 13f)
            horizontalLineTo(4.25f)
            close()
            moveTo(12f, 15.5f)
            curveTo(12f, 14.672f, 12.672f, 14f, 13.5f, 14f)
            horizontalLineTo(21.5f)
            curveTo(22.328f, 14f, 23f, 14.672f, 23f, 15.5f)
            verticalLineTo(19.5f)
            curveTo(23f, 20.328f, 22.328f, 21f, 21.5f, 21f)
            horizontalLineTo(13.5f)
            curveTo(12.672f, 21f, 12f, 20.328f, 12f, 19.5f)
            verticalLineTo(15.5f)
            close()
            moveTo(13f, 16f)
            verticalLineTo(17f)
            curveTo(14.105f, 17f, 15f, 16.105f, 15f, 15f)
            horizontalLineTo(14f)
            curveTo(14f, 15.552f, 13.552f, 16f, 13f, 16f)
            close()
            moveTo(22f, 17f)
            verticalLineTo(16f)
            curveTo(21.448f, 16f, 21f, 15.552f, 21f, 15f)
            horizontalLineTo(20f)
            curveTo(20f, 16.105f, 20.895f, 17f, 22f, 17f)
            close()
            moveTo(20f, 20f)
            horizontalLineTo(21f)
            curveTo(21f, 19.448f, 21.448f, 19f, 22f, 19f)
            verticalLineTo(18f)
            curveTo(20.895f, 18f, 20f, 18.895f, 20f, 20f)
            close()
            moveTo(13f, 18f)
            verticalLineTo(19f)
            curveTo(13.552f, 19f, 14f, 19.448f, 14f, 20f)
            horizontalLineTo(15f)
            curveTo(15f, 18.895f, 14.105f, 18f, 13f, 18f)
            close()
            moveTo(17.5f, 19.25f)
            curveTo(18.466f, 19.25f, 19.25f, 18.466f, 19.25f, 17.5f)
            curveTo(19.25f, 16.534f, 18.466f, 15.75f, 17.5f, 15.75f)
            curveTo(16.534f, 15.75f, 15.75f, 16.534f, 15.75f, 17.5f)
            curveTo(15.75f, 18.466f, 16.534f, 19.25f, 17.5f, 19.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PeopleMoneyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PeopleMoney, contentDescription = null)
    }
}
