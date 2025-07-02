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
 * NotePin icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: note, pin
 * - Source: ic_fluent_note_pin_20_filled.svg
 * 
 * @return The [ImageVector] for the NotePin icon.
 */
public val FluentIcons.Filled.NotePin: ImageVector
    get() {
        if (_notePin != null) {
            return _notePin!!
        }
        _notePin = Builder(name = "NotePin", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 9.018f)
                verticalLineTo(14.0f)
                lineTo(3.005f, 14.176f)
                curveTo(3.096f, 15.751f, 4.402f, 17.0f, 6.0f, 17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.0f)
                lineTo(10.005f, 12.824f)
                curveTo(10.093f, 11.307f, 11.307f, 10.093f, 12.824f, 10.005f)
                lineTo(13.0f, 10.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(6.0f)
                lineTo(16.995f, 5.824f)
                curveTo(16.904f, 4.249f, 15.598f, 3.0f, 14.0f, 3.0f)
                horizontalLineTo(9.463f)
                curveTo(10.41f, 4.115f, 10.068f, 5.855f, 8.722f, 6.51f)
                lineTo(6.831f, 7.432f)
                lineTo(6.389f, 8.711f)
                curveTo(5.95f, 9.98f, 4.335f, 10.352f, 3.385f, 9.403f)
                lineTo(3.0f, 9.018f)
                close()
                moveTo(16.542f, 11.653f)
                curveTo(16.702f, 11.459f, 16.823f, 11.238f, 16.901f, 11.001f)
                lineTo(13.0f, 11.0f)
                lineTo(12.843f, 11.006f)
                curveTo(11.861f, 11.082f, 11.078f, 11.868f, 11.005f, 12.851f)
                lineTo(11.0f, 13.0f)
                lineTo(11.001f, 16.901f)
                curveTo(11.297f, 16.804f, 11.569f, 16.638f, 11.793f, 16.414f)
                lineTo(16.414f, 11.793f)
                lineTo(16.542f, 11.653f)
                close()
                moveTo(8.538f, 3.387f)
                lineTo(6.611f, 1.46f)
                curveTo(5.883f, 0.732f, 4.653f, 0.938f, 4.202f, 1.864f)
                lineTo(3.4f, 3.511f)
                curveTo(3.284f, 3.749f, 3.078f, 3.932f, 2.827f, 4.018f)
                lineTo(1.725f, 4.399f)
                curveTo(1.027f, 4.64f, 0.823f, 5.529f, 1.345f, 6.051f)
                lineTo(2.293f, 6.999f)
                lineTo(1.0f, 8.291f)
                verticalLineTo(8.998f)
                horizontalLineTo(1.707f)
                lineTo(3.0f, 7.706f)
                lineTo(3.947f, 8.653f)
                curveTo(4.47f, 9.176f, 5.358f, 8.971f, 5.6f, 8.273f)
                lineTo(5.98f, 7.171f)
                curveTo(6.067f, 6.921f, 6.249f, 6.715f, 6.487f, 6.599f)
                lineTo(8.134f, 5.796f)
                curveTo(9.061f, 5.345f, 9.267f, 4.116f, 8.538f, 3.387f)
                close()
            }
        }
        .build()
        return _notePin!!
    }

@Suppress("ObjectPropertyName")
private var _notePin: ImageVector? = null

@Preview
@Composable
private fun NotePinPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.NotePin, contentDescription = null)
    }
}

