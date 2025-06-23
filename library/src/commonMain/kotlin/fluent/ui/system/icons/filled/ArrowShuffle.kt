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

public val FluentIcons.Filled.ArrowShuffle: ImageVector
    get() {
        if (_ArrowShuffle != null) {
            return _ArrowShuffle!!
        }
        _ArrowShuffle = ImageVector.Builder(
            name = "Filled.ArrowShuffle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(19.207f, 4.293f)
                curveTo(18.817f, 3.902f, 18.183f, 3.902f, 17.793f, 4.293f)
                curveTo(17.402f, 4.683f, 17.402f, 5.317f, 17.793f, 5.707f)
                lineTo(18.594f, 6.509f)
                curveTo(14.785f, 6.67f, 12.425f, 9.099f, 10.368f, 11.215f)
                lineTo(10.283f, 11.303f)
                curveTo(8.057f, 13.593f, 6.147f, 15.5f, 3f, 15.5f)
                curveTo(2.448f, 15.5f, 2f, 15.948f, 2f, 16.5f)
                curveTo(2f, 17.052f, 2.448f, 17.5f, 3f, 17.5f)
                curveTo(7.049f, 17.5f, 9.503f, 14.975f, 11.632f, 12.785f)
                lineTo(11.717f, 12.697f)
                curveTo(13.841f, 10.512f, 15.677f, 8.676f, 18.574f, 8.512f)
                lineTo(17.793f, 9.293f)
                curveTo(17.402f, 9.683f, 17.402f, 10.317f, 17.793f, 10.707f)
                curveTo(18.183f, 11.098f, 18.817f, 11.098f, 19.207f, 10.707f)
                lineTo(21.707f, 8.207f)
                curveTo(21.895f, 8.02f, 22f, 7.765f, 22f, 7.5f)
                curveTo(22f, 7.235f, 21.895f, 6.98f, 21.707f, 6.793f)
                lineTo(19.207f, 4.293f)
                close()
                moveTo(3f, 6.5f)
                curveTo(6.229f, 6.5f, 8.443f, 8.105f, 10.287f, 9.866f)
                curveTo(10.09f, 10.066f, 9.899f, 10.263f, 9.713f, 10.455f)
                lineTo(9.566f, 10.606f)
                curveTo(9.333f, 10.845f, 9.107f, 11.076f, 8.886f, 11.299f)
                curveTo(7.185f, 9.68f, 5.475f, 8.5f, 3f, 8.5f)
                curveTo(2.448f, 8.5f, 2f, 8.053f, 2f, 7.5f)
                curveTo(2f, 6.948f, 2.448f, 6.5f, 3f, 6.5f)
                close()
                moveTo(18.594f, 17.491f)
                curveTo(15.584f, 17.364f, 13.479f, 15.82f, 11.713f, 14.134f)
                curveTo(11.91f, 13.934f, 12.101f, 13.737f, 12.287f, 13.545f)
                lineTo(12.434f, 13.394f)
                curveTo(12.667f, 13.155f, 12.892f, 12.924f, 13.114f, 12.701f)
                curveTo(14.715f, 14.225f, 16.325f, 15.361f, 18.574f, 15.488f)
                lineTo(17.793f, 14.707f)
                curveTo(17.402f, 14.317f, 17.402f, 13.683f, 17.793f, 13.293f)
                curveTo(18.183f, 12.902f, 18.817f, 12.902f, 19.207f, 13.293f)
                lineTo(21.707f, 15.793f)
                curveTo(21.895f, 15.98f, 22f, 16.235f, 22f, 16.5f)
                curveTo(22f, 16.765f, 21.895f, 17.02f, 21.707f, 17.207f)
                lineTo(19.207f, 19.707f)
                curveTo(18.817f, 20.098f, 18.183f, 20.098f, 17.793f, 19.707f)
                curveTo(17.402f, 19.317f, 17.402f, 18.683f, 17.793f, 18.293f)
                lineTo(18.594f, 17.491f)
                close()
            }
        }.build()

        return _ArrowShuffle!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowShuffle: ImageVector? = null

@Preview
@Composable
private fun ArrowShufflePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowShuffle, contentDescription = null)
    }
}
