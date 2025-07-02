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
 * TagMultiple icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: tag, multiple
 * - Source: ic_fluent_tag_multiple_24_regular.svg
 * 
 * @return The [ImageVector] for the TagMultiple icon.
 */
public val FluentIcons.Regular.TagMultiple: ImageVector
    get() {
        if (_tagMultiple != null) {
            return _tagMultiple!!
        }
        _tagMultiple = Builder(name = "TagMultiple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.5f, 6.5f)
                curveTo(17.5f, 7.19f, 16.94f, 7.75f, 16.25f, 7.75f)
                curveTo(15.56f, 7.75f, 15.0f, 7.19f, 15.0f, 6.5f)
                curveTo(15.0f, 5.81f, 15.56f, 5.25f, 16.25f, 5.25f)
                curveTo(16.94f, 5.25f, 17.5f, 5.81f, 17.5f, 6.5f)
                close()
                moveTo(10.508f, 2.898f)
                curveTo(11.112f, 2.322f, 11.915f, 2.0f, 12.751f, 2.0f)
                horizontalLineTo(18.25f)
                curveTo(19.768f, 2.0f, 21.0f, 3.231f, 21.0f, 4.75f)
                verticalLineTo(9.703f)
                curveTo(21.0f, 10.574f, 20.65f, 11.408f, 20.029f, 12.019f)
                lineTo(13.084f, 18.854f)
                curveTo(12.205f, 19.719f, 10.793f, 19.715f, 9.918f, 18.844f)
                lineTo(3.662f, 12.618f)
                curveTo(2.765f, 11.725f, 2.78f, 10.268f, 3.696f, 9.395f)
                lineTo(10.508f, 2.898f)
                close()
                moveTo(12.751f, 3.5f)
                curveTo(12.301f, 3.5f, 11.868f, 3.673f, 11.543f, 3.984f)
                lineTo(4.731f, 10.48f)
                curveTo(4.426f, 10.771f, 4.421f, 11.257f, 4.72f, 11.554f)
                lineTo(10.977f, 17.781f)
                curveTo(11.268f, 18.071f, 11.739f, 18.073f, 12.032f, 17.784f)
                lineTo(18.977f, 10.95f)
                curveTo(19.311f, 10.621f, 19.5f, 10.172f, 19.5f, 9.703f)
                verticalLineTo(4.75f)
                curveTo(19.5f, 4.06f, 18.94f, 3.5f, 18.25f, 3.5f)
                horizontalLineTo(12.751f)
                close()
                moveTo(20.731f, 12.732f)
                lineTo(19.256f, 14.183f)
                curveTo(19.216f, 14.238f, 19.171f, 14.289f, 19.122f, 14.338f)
                lineTo(13.788f, 19.566f)
                curveTo(13.579f, 19.772f, 13.348f, 19.943f, 13.104f, 20.081f)
                curveTo(11.866f, 20.78f, 10.269f, 20.604f, 9.213f, 19.553f)
                lineTo(7.282f, 17.631f)
                lineTo(4.871f, 15.245f)
                curveTo(4.832f, 15.207f, 4.796f, 15.167f, 4.764f, 15.125f)
                lineTo(3.135f, 13.504f)
                curveTo(2.824f, 14.461f, 3.051f, 15.554f, 3.816f, 16.311f)
                lineTo(8.172f, 20.622f)
                curveTo(10.017f, 22.448f, 12.985f, 22.454f, 14.838f, 20.638f)
                lineTo(20.172f, 15.409f)
                curveTo(20.945f, 14.651f, 21.173f, 13.554f, 20.863f, 12.596f)
                curveTo(20.82f, 12.642f, 20.776f, 12.688f, 20.731f, 12.732f)
                close()
            }
        }
        .build()
        return _tagMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _tagMultiple: ImageVector? = null

@Preview
@Composable
private fun TagMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TagMultiple, contentDescription = null)
    }
}

