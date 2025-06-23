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

public val FluentIcons.Filled.PenProhibited: ImageVector
    get() {
        if (_PenProhibited != null) {
            return _PenProhibited!!
        }
        _PenProhibited = ImageVector.Builder(
            name = "Filled.PenProhibited",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(20.952f, 3.047f)
                curveTo(19.554f, 1.65f, 17.288f, 1.65f, 15.891f, 3.047f)
                lineTo(3.941f, 14.999f)
                curveTo(3.535f, 15.405f, 3.249f, 15.916f, 3.116f, 16.475f)
                lineTo(2.02f, 21.077f)
                curveTo(1.96f, 21.33f, 2.036f, 21.597f, 2.22f, 21.781f)
                curveTo(2.404f, 21.965f, 2.67f, 22.04f, 2.924f, 21.98f)
                lineTo(7.525f, 20.885f)
                curveTo(8.084f, 20.751f, 8.595f, 20.466f, 9.002f, 20.059f)
                lineTo(10.153f, 18.908f)
                curveTo(10.053f, 18.455f, 10f, 17.983f, 10f, 17.5f)
                curveTo(10f, 13.91f, 12.91f, 11f, 16.5f, 11f)
                curveTo(16.983f, 11f, 17.454f, 11.052f, 17.907f, 11.153f)
                lineTo(20.952f, 8.108f)
                curveTo(22.349f, 6.71f, 22.349f, 4.445f, 20.952f, 3.047f)
                close()
                moveTo(22f, 17.5f)
                curveTo(22f, 14.462f, 19.538f, 12f, 16.5f, 12f)
                curveTo(13.462f, 12f, 11f, 14.462f, 11f, 17.5f)
                curveTo(11f, 20.537f, 13.462f, 23f, 16.5f, 23f)
                curveTo(19.538f, 23f, 22f, 20.537f, 22f, 17.5f)
                close()
                moveTo(12.5f, 17.5f)
                curveTo(12.5f, 15.29f, 14.291f, 13.5f, 16.5f, 13.5f)
                curveTo(17.333f, 13.5f, 18.108f, 13.755f, 18.748f, 14.191f)
                lineTo(13.191f, 19.748f)
                curveTo(12.755f, 19.107f, 12.5f, 18.333f, 12.5f, 17.5f)
                close()
                moveTo(16.5f, 21.5f)
                curveTo(15.667f, 21.5f, 14.892f, 21.245f, 14.252f, 20.809f)
                lineTo(19.809f, 15.251f)
                curveTo(20.245f, 15.892f, 20.5f, 16.666f, 20.5f, 17.5f)
                curveTo(20.5f, 19.709f, 18.709f, 21.5f, 16.5f, 21.5f)
                close()
            }
        }.build()

        return _PenProhibited!!
    }

@Suppress("ObjectPropertyName")
private var _PenProhibited: ImageVector? = null

@Preview
@Composable
private fun PenProhibitedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PenProhibited, contentDescription = null)
    }
}
