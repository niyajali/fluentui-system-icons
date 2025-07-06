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
 * DocumentOnePageBeaker Icon (16dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 16dp
 * - Keywords: fluent-icon
 * - Description: Used to represent general file types and actions.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_document_one_page_beaker_16_regular.svg)
 * 
 * @return The [ImageVector] for the DocumentOnePageBeaker icon.
 */
public val FluentIcons.Regular.DocumentOnePageBeaker: ImageVector
    get() {
        if (_documentOnePageBeaker != null) {
            return _documentOnePageBeaker!!
        }
        _documentOnePageBeaker = Builder(name = "DocumentOnePageBeaker", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.59f, 4.992f)
                curveTo(9.823f, 4.95f, 10.0f, 4.745f, 10.0f, 4.5f)
                curveTo(10.0f, 4.224f, 9.776f, 4.0f, 9.5f, 4.0f)
                horizontalLineTo(6.5f)
                lineTo(6.41f, 4.008f)
                curveTo(6.177f, 4.05f, 6.0f, 4.255f, 6.0f, 4.5f)
                curveTo(6.0f, 4.776f, 6.224f, 5.0f, 6.5f, 5.0f)
                horizontalLineTo(9.5f)
                lineTo(9.59f, 4.992f)
                close()
                moveTo(9.59f, 8.492f)
                curveTo(9.808f, 8.452f, 9.977f, 8.271f, 9.998f, 8.047f)
                verticalLineTo(7.952f)
                curveTo(9.996f, 7.939f, 9.995f, 7.925f, 9.992f, 7.912f)
                curveTo(9.755f, 7.827f, 9.546f, 7.684f, 9.382f, 7.5f)
                horizontalLineTo(6.5f)
                lineTo(6.41f, 7.508f)
                curveTo(6.177f, 7.55f, 6.0f, 7.755f, 6.0f, 8.0f)
                curveTo(6.0f, 8.276f, 6.224f, 8.5f, 6.5f, 8.5f)
                horizontalLineTo(9.5f)
                lineTo(9.59f, 8.492f)
                close()
                moveTo(12.0f, 3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.0f)
                curveTo(13.0f, 1.895f, 12.105f, 1.0f, 11.0f, 1.0f)
                horizontalLineTo(5.0f)
                curveTo(3.895f, 1.0f, 3.0f, 1.895f, 3.0f, 3.0f)
                verticalLineTo(13.0f)
                curveTo(3.0f, 14.105f, 3.895f, 15.0f, 5.0f, 15.0f)
                horizontalLineTo(8.267f)
                curveTo(8.094f, 14.7f, 7.997f, 14.356f, 7.997f, 14.0f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 14.0f, 4.0f, 13.552f, 4.0f, 13.0f)
                verticalLineTo(3.0f)
                curveTo(4.0f, 2.448f, 4.448f, 2.0f, 5.0f, 2.0f)
                horizontalLineTo(11.0f)
                curveTo(11.552f, 2.0f, 12.0f, 2.448f, 12.0f, 3.0f)
                close()
                moveTo(6.5f, 10.992f)
                horizontalLineTo(9.305f)
                lineTo(8.787f, 11.992f)
                horizontalLineTo(6.5f)
                curveTo(6.224f, 11.992f, 6.0f, 11.768f, 6.0f, 11.492f)
                curveTo(6.0f, 11.247f, 6.177f, 11.042f, 6.41f, 11.0f)
                lineTo(6.5f, 10.992f)
                close()
                moveTo(13.996f, 9.405f)
                curveTo(13.996f, 9.725f, 14.072f, 10.04f, 14.22f, 10.324f)
                lineTo(14.569f, 11.0f)
                horizontalLineTo(10.427f)
                lineTo(10.774f, 10.33f)
                curveTo(10.921f, 10.045f, 10.998f, 9.73f, 10.998f, 9.41f)
                verticalLineTo(7.0f)
                horizontalLineTo(10.5f)
                curveTo(10.224f, 7.0f, 10.0f, 6.776f, 10.0f, 6.5f)
                curveTo(10.0f, 6.224f, 10.224f, 6.0f, 10.5f, 6.0f)
                horizontalLineTo(14.5f)
                curveTo(14.776f, 6.0f, 15.0f, 6.224f, 15.0f, 6.5f)
                curveTo(15.0f, 6.776f, 14.776f, 7.0f, 14.5f, 7.0f)
                horizontalLineTo(13.996f)
                verticalLineTo(9.405f)
                close()
                moveTo(9.909f, 12.0f)
                lineTo(9.111f, 13.54f)
                curveTo(8.767f, 14.206f, 9.25f, 15.0f, 9.999f, 15.0f)
                horizontalLineTo(14.997f)
                curveTo(15.747f, 15.0f, 16.23f, 14.206f, 15.885f, 13.54f)
                lineTo(15.087f, 12.0f)
                horizontalLineTo(9.909f)
                close()
            }
        }
        .build()
        return _documentOnePageBeaker!!
    }

@Suppress("ObjectPropertyName")
private var _documentOnePageBeaker: ImageVector? = null

@Preview
@Composable
private fun DocumentOnePageBeakerPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DocumentOnePageBeaker, contentDescription = "DocumentOnePageBeaker Icon")
    }
}

