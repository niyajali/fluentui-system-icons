package fluent.ui.system.icons.filled

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
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.BuildingFactory: ImageVector
    get() {
        if (_BuildingFactory != null) {
            return _BuildingFactory!!
        }
        _BuildingFactory = ImageVector.Builder(
            name = "Filled.BuildingFactory",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2.923f, 4.129f)
                curveTo(2.988f, 2.935f, 3.974f, 2f, 5.17f, 2f)
                horizontalLineTo(6.328f)
                curveTo(7.523f, 2f, 8.51f, 2.935f, 8.574f, 4.129f)
                lineTo(9.412f, 19.629f)
                curveTo(9.482f, 20.917f, 8.456f, 22f, 7.166f, 22f)
                horizontalLineTo(4.332f)
                curveTo(3.042f, 22f, 2.016f, 20.917f, 2.085f, 19.629f)
                lineTo(2.923f, 4.129f)
                close()
                moveTo(9.511f, 22f)
                horizontalLineTo(19.749f)
                curveTo(20.992f, 22f, 21.999f, 20.993f, 21.999f, 19.75f)
                verticalLineTo(6f)
                curveTo(21.999f, 5.702f, 21.823f, 5.432f, 21.55f, 5.313f)
                curveTo(21.277f, 5.193f, 20.959f, 5.247f, 20.74f, 5.449f)
                lineTo(15.499f, 10.287f)
                verticalLineTo(6f)
                curveTo(15.499f, 5.702f, 15.323f, 5.432f, 15.05f, 5.313f)
                curveTo(14.777f, 5.193f, 14.459f, 5.247f, 14.24f, 5.449f)
                lineTo(9.866f, 9.487f)
                lineTo(10.411f, 19.575f)
                curveTo(10.462f, 20.513f, 10.11f, 21.375f, 9.511f, 22f)
                close()
                moveTo(12.999f, 16f)
                curveTo(12.999f, 15.448f, 13.447f, 15f, 13.999f, 15f)
                horizontalLineTo(17.999f)
                curveTo(18.551f, 15f, 18.999f, 15.448f, 18.999f, 16f)
                verticalLineTo(20.5f)
                horizontalLineTo(12.999f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _BuildingFactory!!
    }

@Suppress("ObjectPropertyName")
private var _BuildingFactory: ImageVector? = null

@Preview
@Composable
private fun BuildingFactoryPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BuildingFactory, contentDescription = null)
    }
}
