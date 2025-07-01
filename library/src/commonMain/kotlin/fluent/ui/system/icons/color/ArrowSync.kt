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
package fluent.ui.system.icons.color

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Color.ArrowSync: ImageVector
    get() {
        if (_ArrowSync != null) {
            return _ArrowSync!!
        }
        _ArrowSync = ImageVector.Builder(
            name = "Colored.ArrowSync",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF22918B),
                        1f to Color(0xFF20AC9D)
                    ),
                    start = Offset(16.8f, 19.475f),
                    end = Offset(7.2f, 0.5f)
                )
            ) {
                moveTo(16.052f, 5.029f)
                curveTo(15.717f, 5.468f, 15.801f, 6.095f, 16.24f, 6.43f)
                curveTo(17.968f, 7.747f, 19f, 9.787f, 19f, 12f)
                curveTo(19f, 15.497f, 16.435f, 18.396f, 13.084f, 18.917f)
                lineTo(13.793f, 18.207f)
                curveTo(14.183f, 17.817f, 14.183f, 17.183f, 13.793f, 16.793f)
                curveTo(13.402f, 16.402f, 12.769f, 16.402f, 12.379f, 16.793f)
                lineTo(9.879f, 19.293f)
                curveTo(9.488f, 19.683f, 9.488f, 20.317f, 9.879f, 20.707f)
                lineTo(12.379f, 23.207f)
                curveTo(12.769f, 23.598f, 13.402f, 23.598f, 13.793f, 23.207f)
                curveTo(14.183f, 22.817f, 14.183f, 22.183f, 13.793f, 21.793f)
                lineTo(12.95f, 20.951f)
                curveTo(17.474f, 20.476f, 21f, 16.65f, 21f, 12f)
                curveTo(21f, 9.156f, 19.671f, 6.531f, 17.453f, 4.84f)
                curveTo(17.014f, 4.505f, 16.387f, 4.589f, 16.052f, 5.029f)
                close()
                moveTo(14.121f, 3.293f)
                lineTo(11.621f, 0.793f)
                curveTo(11.231f, 0.402f, 10.598f, 0.402f, 10.207f, 0.793f)
                curveTo(9.847f, 1.153f, 9.819f, 1.721f, 10.124f, 2.113f)
                lineTo(10.207f, 2.207f)
                lineTo(11.05f, 3.05f)
                curveTo(6.526f, 3.524f, 3f, 7.35f, 3f, 12f)
                curveTo(3f, 14.72f, 4.215f, 17.243f, 6.272f, 18.942f)
                curveTo(6.697f, 19.294f, 7.328f, 19.233f, 7.679f, 18.808f)
                curveTo(8.031f, 18.382f, 7.971f, 17.752f, 7.545f, 17.4f)
                curveTo(5.944f, 16.077f, 5f, 14.117f, 5f, 12f)
                curveTo(5f, 8.503f, 7.565f, 5.604f, 10.916f, 5.083f)
                lineTo(10.207f, 5.793f)
                curveTo(9.817f, 6.183f, 9.817f, 6.817f, 10.207f, 7.207f)
                curveTo(10.568f, 7.568f, 11.135f, 7.595f, 11.527f, 7.29f)
                lineTo(11.621f, 7.207f)
                lineTo(14.121f, 4.707f)
                curveTo(14.482f, 4.347f, 14.509f, 3.779f, 14.205f, 3.387f)
                lineTo(14.121f, 3.293f)
                close()
            }
        }.build()

        return _ArrowSync!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowSync: ImageVector? = null

@Preview
@Composable
private fun ArrowSyncPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Color.ArrowSync, contentDescription = null)
    }
}
