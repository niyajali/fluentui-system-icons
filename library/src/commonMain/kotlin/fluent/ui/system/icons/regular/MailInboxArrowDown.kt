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
 * MailInboxArrowDown icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: mail, inbox, arrow, down
 * - Source: ic_fluent_mail_inbox_arrow_down_20_regular.svg
 * 
 * @return The [ImageVector] for the MailInboxArrowDown icon.
 */
public val FluentIcons.Regular.MailInboxArrowDown: ImageVector
    get() {
        if (_mailInboxArrowDown != null) {
            return _mailInboxArrowDown!!
        }
        _mailInboxArrowDown = Builder(name = "MailInboxArrowDown", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.022f, 5.0f)
                horizontalLineTo(6.0f)
                curveTo(4.895f, 5.0f, 4.0f, 5.895f, 4.0f, 7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.5f)
                curveTo(7.776f, 11.0f, 8.0f, 11.224f, 8.0f, 11.499f)
                lineTo(8.0f, 11.512f)
                curveTo(8.001f, 11.524f, 8.002f, 11.544f, 8.004f, 11.572f)
                curveTo(8.008f, 11.627f, 8.016f, 11.709f, 8.032f, 11.809f)
                curveTo(8.066f, 12.01f, 8.132f, 12.271f, 8.26f, 12.526f)
                curveTo(8.386f, 12.78f, 8.568f, 13.018f, 8.832f, 13.193f)
                curveTo(9.093f, 13.367f, 9.462f, 13.5f, 10.0f, 13.5f)
                curveTo(10.538f, 13.5f, 10.907f, 13.367f, 11.168f, 13.193f)
                curveTo(11.432f, 13.018f, 11.614f, 12.78f, 11.74f, 12.526f)
                curveTo(11.816f, 12.375f, 11.87f, 12.221f, 11.909f, 12.078f)
                curveTo(11.935f, 11.982f, 11.954f, 11.89f, 11.968f, 11.809f)
                curveTo(11.984f, 11.709f, 11.992f, 11.627f, 11.996f, 11.572f)
                curveTo(11.998f, 11.544f, 11.999f, 11.524f, 12.0f, 11.512f)
                lineTo(12.0f, 11.499f)
                curveTo(12.0f, 11.223f, 12.224f, 11.0f, 12.5f, 11.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(10.4f)
                curveTo(16.358f, 10.217f, 16.693f, 9.996f, 17.0f, 9.743f)
                verticalLineTo(15.0f)
                curveTo(17.0f, 16.657f, 15.657f, 18.0f, 14.0f, 18.0f)
                horizontalLineTo(6.0f)
                curveTo(4.343f, 18.0f, 3.0f, 16.657f, 3.0f, 15.0f)
                verticalLineTo(7.0f)
                curveTo(3.0f, 5.343f, 4.343f, 4.0f, 6.0f, 4.0f)
                horizontalLineTo(8.207f)
                curveTo(8.116f, 4.322f, 8.053f, 4.657f, 8.022f, 5.0f)
                close()
                moveTo(7.05f, 12.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(15.0f)
                curveTo(4.0f, 16.105f, 4.895f, 17.0f, 6.0f, 17.0f)
                horizontalLineTo(14.0f)
                curveTo(15.105f, 17.0f, 16.0f, 16.105f, 16.0f, 15.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(12.95f)
                curveTo(12.903f, 12.264f, 12.813f, 12.616f, 12.635f, 12.974f)
                curveTo(12.449f, 13.345f, 12.162f, 13.732f, 11.723f, 14.025f)
                curveTo(11.28f, 14.32f, 10.712f, 14.5f, 10.0f, 14.5f)
                curveTo(9.288f, 14.5f, 8.72f, 14.32f, 8.277f, 14.025f)
                curveTo(7.838f, 13.732f, 7.551f, 13.345f, 7.365f, 12.974f)
                curveTo(7.187f, 12.616f, 7.096f, 12.264f, 7.05f, 12.0f)
                close()
                moveTo(13.5f, 10.0f)
                curveTo(15.985f, 10.0f, 18.0f, 7.985f, 18.0f, 5.5f)
                curveTo(18.0f, 3.015f, 15.985f, 1.0f, 13.5f, 1.0f)
                curveTo(11.015f, 1.0f, 9.0f, 3.015f, 9.0f, 5.5f)
                curveTo(9.0f, 7.985f, 11.015f, 10.0f, 13.5f, 10.0f)
                close()
                moveTo(11.146f, 5.854f)
                curveTo(10.951f, 5.658f, 10.951f, 5.342f, 11.146f, 5.146f)
                curveTo(11.342f, 4.951f, 11.658f, 4.951f, 11.854f, 5.146f)
                lineTo(13.0f, 6.293f)
                verticalLineTo(3.5f)
                curveTo(13.0f, 3.224f, 13.224f, 3.0f, 13.5f, 3.0f)
                curveTo(13.776f, 3.0f, 14.0f, 3.224f, 14.0f, 3.5f)
                verticalLineTo(6.293f)
                lineTo(15.146f, 5.146f)
                curveTo(15.342f, 4.951f, 15.658f, 4.951f, 15.854f, 5.146f)
                curveTo(16.049f, 5.342f, 16.049f, 5.658f, 15.854f, 5.854f)
                lineTo(13.854f, 7.854f)
                curveTo(13.806f, 7.901f, 13.75f, 7.938f, 13.691f, 7.962f)
                curveTo(13.633f, 7.986f, 13.57f, 8.0f, 13.503f, 8.0f)
                lineTo(13.5f, 8.0f)
                lineTo(13.497f, 8.0f)
                curveTo(13.43f, 8.0f, 13.367f, 7.986f, 13.309f, 7.962f)
                curveTo(13.25f, 7.938f, 13.196f, 7.903f, 13.149f, 7.856f)
                lineTo(13.146f, 7.853f)
                lineTo(11.146f, 5.854f)
                close()
            }
        }
        .build()
        return _mailInboxArrowDown!!
    }

@Suppress("ObjectPropertyName")
private var _mailInboxArrowDown: ImageVector? = null

@Preview
@Composable
private fun MailInboxArrowDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.MailInboxArrowDown, contentDescription = null)
    }
}

