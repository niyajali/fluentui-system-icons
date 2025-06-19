package fluent.ui.system.icons.colored

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Colored.Molecule: ImageVector
    get() {
        if (_Molecule != null) {
            return _Molecule!!
        }
        _Molecule = ImageVector.Builder(
            name = "Colored.Molecule",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.584f, 12.876f)
                lineTo(14.834f, 7.376f)
                lineTo(15.666f, 8.624f)
                lineTo(7.416f, 14.124f)
                lineTo(6.584f, 12.876f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFB9C0C7),
                        1f to Color(0xFF70777D)
                    ),
                    start = Offset(6.584f, 7.376f),
                    end = Offset(8.475f, 14.648f)
                )
            ) {
                moveTo(6.584f, 12.876f)
                lineTo(14.834f, 7.376f)
                lineTo(15.666f, 8.624f)
                lineTo(7.416f, 14.124f)
                lineTo(6.584f, 12.876f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0.628f to Color(0xFF70777D),
                        1f to Color(0x0070777D)
                    ),
                    center = Offset(16f, 7f),
                    radius = 6.801f
                )
            ) {
                moveTo(6.584f, 12.876f)
                lineTo(14.834f, 7.376f)
                lineTo(15.666f, 8.624f)
                lineTo(7.416f, 14.124f)
                lineTo(6.584f, 12.876f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0.563f to Color(0xFF70777D),
                        1f to Color(0x0070777D)
                    ),
                    center = Offset(6f, 14f),
                    radius = 5.408f
                )
            ) {
                moveTo(6.584f, 12.876f)
                lineTo(14.834f, 7.376f)
                lineTo(15.666f, 8.624f)
                lineTo(7.416f, 14.124f)
                lineTo(6.584f, 12.876f)
                close()
            }
            path(fill = SolidColor(Color(0xFF242424))) {
                moveTo(15.665f, 19.671f)
                lineTo(5.665f, 14.671f)
                lineTo(6.335f, 13.329f)
                lineTo(16.335f, 18.329f)
                lineTo(15.665f, 19.671f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFB9C0C7),
                        1f to Color(0xFF70777D)
                    ),
                    start = Offset(5.665f, 13.329f),
                    end = Offset(7.119f, 20.323f)
                )
            ) {
                moveTo(15.665f, 19.671f)
                lineTo(5.665f, 14.671f)
                lineTo(6.335f, 13.329f)
                lineTo(16.335f, 18.329f)
                lineTo(15.665f, 19.671f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0.563f to Color(0xFF70777D),
                        1f to Color(0x0070777D)
                    ),
                    center = Offset(16f, 19f),
                    radius = 4.472f
                )
            ) {
                moveTo(15.665f, 19.671f)
                lineTo(5.665f, 14.671f)
                lineTo(6.335f, 13.329f)
                lineTo(16.335f, 18.329f)
                lineTo(15.665f, 19.671f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0.677f to Color(0xFF70777D),
                        1f to Color(0x0070777D)
                    ),
                    center = Offset(6f, 14f),
                    radius = 5.59f
                )
            ) {
                moveTo(15.665f, 19.671f)
                lineTo(5.665f, 14.671f)
                lineTo(6.335f, 13.329f)
                lineTo(16.335f, 18.329f)
                lineTo(15.665f, 19.671f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF2BDABE),
                        1f to Color(0xFF22918B)
                    ),
                    start = Offset(11.357f, 3.875f),
                    end = Offset(18.258f, 11.045f)
                )
            ) {
                moveTo(16f, 7f)
                moveToRelative(-5f, 0f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 10f, 0f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -10f, 0f)
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFEC318F),
                        1f to Color(0xFFB91D6B)
                    ),
                    start = Offset(2.286f, 11.5f),
                    end = Offset(7.807f, 17.236f)
                )
            ) {
                moveTo(6f, 14f)
                moveToRelative(-4f, 0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, 0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, -8f, 0f)
            }
            path(fill = SolidColor(Color(0xFFD9D9D9))) {
                moveTo(16f, 19f)
                moveToRelative(-3f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6f, 0f)
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFCD0F),
                        1f to Color(0xFFFE8401)
                    ),
                    start = Offset(13.938f, 15.063f),
                    end = Offset(17.875f, 22.563f)
                )
            ) {
                moveTo(16f, 19f)
                moveToRelative(-3f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6f, 0f)
            }
        }.build()

        return _Molecule!!
    }

@Suppress("ObjectPropertyName")
private var _Molecule: ImageVector? = null

@Preview
@Composable
private fun MoleculePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.Molecule, contentDescription = null)
    }
}
