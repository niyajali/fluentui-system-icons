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
 * NotebookEye Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon, visual studio
 * - Description: Used in general organized note scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_notebook_eye_20_regular.svg)
 * 
 * @return The [ImageVector] for the NotebookEye icon.
 */
public val FluentIcons.Regular.NotebookEye: ImageVector
    get() {
        if (_notebookEye != null) {
            return _notebookEye!!
        }
        _notebookEye = Builder(name = "NotebookEye", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.5f, 5.0f)
                curveTo(5.224f, 5.0f, 5.0f, 5.224f, 5.0f, 5.5f)
                verticalLineTo(7.5f)
                curveTo(5.0f, 7.776f, 5.224f, 8.0f, 5.5f, 8.0f)
                horizontalLineTo(12.5f)
                curveTo(12.776f, 8.0f, 13.0f, 7.776f, 13.0f, 7.5f)
                verticalLineTo(5.5f)
                curveTo(13.0f, 5.224f, 12.776f, 5.0f, 12.5f, 5.0f)
                horizontalLineTo(5.5f)
                close()
                moveTo(6.0f, 7.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(3.0f, 4.0f)
                curveTo(3.0f, 2.895f, 3.895f, 2.0f, 5.0f, 2.0f)
                horizontalLineTo(13.0f)
                curveTo(14.105f, 2.0f, 15.0f, 2.895f, 15.0f, 4.0f)
                verticalLineTo(16.0f)
                curveTo(15.0f, 17.105f, 14.105f, 18.0f, 13.0f, 18.0f)
                horizontalLineTo(9.879f)
                curveTo(10.157f, 17.684f, 10.388f, 17.351f, 10.566f, 17.019f)
                lineTo(10.576f, 17.0f)
                horizontalLineTo(13.0f)
                curveTo(13.552f, 17.0f, 14.0f, 16.552f, 14.0f, 16.0f)
                verticalLineTo(4.0f)
                curveTo(14.0f, 3.448f, 13.552f, 3.0f, 13.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 3.0f, 4.0f, 3.448f, 4.0f, 4.0f)
                verticalLineTo(11.197f)
                curveTo(3.646f, 11.292f, 3.312f, 11.419f, 3.0f, 11.569f)
                verticalLineTo(4.0f)
                close()
                moveTo(16.0f, 6.0f)
                horizontalLineTo(16.5f)
                curveTo(16.776f, 6.0f, 17.0f, 6.224f, 17.0f, 6.5f)
                verticalLineTo(8.0f)
                curveTo(17.0f, 8.276f, 16.776f, 8.5f, 16.5f, 8.5f)
                horizontalLineTo(16.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(16.5f, 9.5f)
                horizontalLineTo(16.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.5f)
                curveTo(16.776f, 12.0f, 17.0f, 11.776f, 17.0f, 11.5f)
                verticalLineTo(10.0f)
                curveTo(17.0f, 9.724f, 16.776f, 9.5f, 16.5f, 9.5f)
                close()
                moveTo(16.0f, 13.0f)
                horizontalLineTo(16.5f)
                curveTo(16.776f, 13.0f, 17.0f, 13.224f, 17.0f, 13.5f)
                verticalLineTo(15.0f)
                curveTo(17.0f, 15.276f, 16.776f, 15.5f, 16.5f, 15.5f)
                horizontalLineTo(16.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(1.0f, 15.5f)
                curveTo(1.0f, 14.318f, 2.736f, 12.0f, 5.5f, 12.0f)
                curveTo(8.261f, 12.0f, 10.0f, 14.3f, 10.0f, 15.5f)
                curveTo(10.0f, 16.682f, 8.261f, 19.0f, 5.5f, 19.0f)
                curveTo(2.739f, 19.0f, 1.0f, 16.7f, 1.0f, 15.5f)
                close()
                moveTo(4.111f, 17.579f)
                curveTo(4.522f, 17.853f, 5.006f, 18.0f, 5.5f, 18.0f)
                curveTo(6.163f, 18.0f, 6.799f, 17.737f, 7.268f, 17.268f)
                curveTo(7.737f, 16.799f, 8.0f, 16.163f, 8.0f, 15.5f)
                curveTo(8.0f, 15.005f, 7.853f, 14.522f, 7.579f, 14.111f)
                curveTo(7.304f, 13.7f, 6.914f, 13.38f, 6.457f, 13.19f)
                curveTo(6.0f, 13.001f, 5.497f, 12.952f, 5.012f, 13.048f)
                curveTo(4.527f, 13.144f, 4.082f, 13.383f, 3.732f, 13.732f)
                curveTo(3.383f, 14.082f, 3.145f, 14.527f, 3.048f, 15.012f)
                curveTo(2.952f, 15.497f, 3.001f, 16.0f, 3.19f, 16.457f)
                curveTo(3.38f, 16.913f, 3.7f, 17.304f, 4.111f, 17.579f)
                close()
                moveTo(6.747f, 16.333f)
                curveTo(6.912f, 16.087f, 7.0f, 15.797f, 7.0f, 15.5f)
                curveTo(7.0f, 15.102f, 6.842f, 14.721f, 6.561f, 14.439f)
                curveTo(6.279f, 14.158f, 5.898f, 14.0f, 5.5f, 14.0f)
                curveTo(5.203f, 14.0f, 4.913f, 14.088f, 4.667f, 14.253f)
                curveTo(4.42f, 14.418f, 4.228f, 14.652f, 4.114f, 14.926f)
                curveTo(4.001f, 15.2f, 3.971f, 15.502f, 4.029f, 15.793f)
                curveTo(4.087f, 16.084f, 4.23f, 16.351f, 4.439f, 16.561f)
                curveTo(4.649f, 16.77f, 4.916f, 16.913f, 5.207f, 16.971f)
                curveTo(5.498f, 17.029f, 5.8f, 16.999f, 6.074f, 16.886f)
                curveTo(6.348f, 16.772f, 6.582f, 16.58f, 6.747f, 16.333f)
                close()
            }
        }
        .build()
        return _notebookEye!!
    }

@Suppress("ObjectPropertyName")
private var _notebookEye: ImageVector? = null

@Preview
@Composable
private fun NotebookEyePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.NotebookEye, contentDescription = "NotebookEye Icon")
    }
}

