/*
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * GavelProhibited icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: gavel, prohibited
 * - Source: ic_fluent_gavel_prohibited_20_regular.svg
 * 
 * @return The [ImageVector] for the GavelProhibited icon.
 */
public val FluentIcons.Regular.GavelProhibited: ImageVector
    get() {
        if (_gavelProhibited != null) {
            return _gavelProhibited!!
        }
        _gavelProhibited = Builder(name = "GavelProhibited", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.439f, 5.283f)
                curveTo(5.771f, 5.951f, 5.88f, 7.064f, 6.665f, 7.59f)
                lineTo(8.431f, 8.773f)
                lineTo(2.578f, 14.626f)
                curveTo(1.806f, 15.398f, 1.806f, 16.649f, 2.578f, 17.421f)
                curveTo(3.35f, 18.193f, 4.601f, 18.193f, 5.373f, 17.421f)
                lineTo(9.052f, 13.743f)
                curveTo(9.166f, 12.913f, 9.465f, 12.142f, 9.907f, 11.473f)
                lineTo(4.666f, 16.714f)
                curveTo(4.285f, 17.095f, 3.666f, 17.095f, 3.285f, 16.714f)
                curveTo(2.904f, 16.333f, 2.904f, 15.715f, 3.285f, 15.333f)
                lineTo(9.278f, 9.341f)
                lineTo(10.022f, 9.84f)
                curveTo(10.077f, 9.876f, 10.123f, 9.923f, 10.159f, 9.977f)
                lineTo(10.595f, 10.627f)
                curveTo(10.831f, 10.389f, 11.089f, 10.172f, 11.365f, 9.98f)
                lineTo(10.99f, 9.42f)
                curveTo(10.881f, 9.258f, 10.741f, 9.118f, 10.579f, 9.009f)
                lineTo(8.866f, 7.861f)
                lineTo(11.906f, 4.821f)
                lineTo(13.133f, 6.525f)
                curveTo(13.228f, 6.656f, 13.343f, 6.771f, 13.474f, 6.866f)
                lineTo(15.179f, 8.094f)
                lineTo(14.267f, 9.005f)
                curveTo(14.344f, 9.002f, 14.422f, 9.0f, 14.5f, 9.0f)
                curveTo(14.87f, 9.0f, 15.231f, 9.036f, 15.58f, 9.106f)
                lineTo(16.0f, 8.686f)
                lineTo(16.788f, 9.253f)
                curveTo(16.906f, 9.338f, 16.975f, 9.464f, 16.992f, 9.595f)
                curveTo(17.315f, 9.76f, 17.621f, 9.956f, 17.903f, 10.179f)
                curveTo(18.128f, 9.57f, 17.94f, 8.85f, 17.372f, 8.442f)
                lineTo(14.058f, 6.054f)
                curveTo(14.015f, 6.023f, 13.976f, 5.984f, 13.945f, 5.941f)
                lineTo(11.558f, 2.626f)
                curveTo(11.017f, 1.876f, 9.934f, 1.788f, 9.28f, 2.442f)
                lineTo(6.439f, 5.283f)
                close()
                moveTo(7.222f, 6.759f)
                curveTo(6.96f, 6.584f, 6.924f, 6.213f, 7.146f, 5.99f)
                lineTo(9.987f, 3.149f)
                curveTo(10.205f, 2.931f, 10.566f, 2.96f, 10.746f, 3.21f)
                lineTo(11.314f, 3.999f)
                lineTo(8.019f, 7.294f)
                lineTo(7.222f, 6.759f)
                close()
                moveTo(10.0f, 14.5f)
                curveTo(10.0f, 16.985f, 12.015f, 19.0f, 14.5f, 19.0f)
                curveTo(16.985f, 19.0f, 19.0f, 16.985f, 19.0f, 14.5f)
                curveTo(19.0f, 12.015f, 16.985f, 10.0f, 14.5f, 10.0f)
                curveTo(12.015f, 10.0f, 10.0f, 12.015f, 10.0f, 14.5f)
                close()
                moveTo(11.0f, 14.5f)
                curveTo(11.0f, 12.567f, 12.567f, 11.0f, 14.5f, 11.0f)
                curveTo(15.286f, 11.0f, 16.012f, 11.259f, 16.596f, 11.697f)
                lineTo(11.697f, 16.596f)
                curveTo(11.259f, 16.012f, 11.0f, 15.286f, 11.0f, 14.5f)
                close()
                moveTo(14.5f, 18.0f)
                curveTo(13.714f, 18.0f, 12.988f, 17.741f, 12.404f, 17.303f)
                lineTo(17.303f, 12.404f)
                curveTo(17.741f, 12.988f, 18.0f, 13.714f, 18.0f, 14.5f)
                curveTo(18.0f, 16.433f, 16.433f, 18.0f, 14.5f, 18.0f)
                close()
            }
        }
        .build()
        return _gavelProhibited!!
    }

@Suppress("ObjectPropertyName")
private var _gavelProhibited: ImageVector? = null

@Preview
@Composable
private fun GavelProhibitedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.GavelProhibited, contentDescription = null)
    }
}

