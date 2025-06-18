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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.CalendarDate: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarDate",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21f, 8.5f)
            verticalLineTo(17.75f)
            curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(8.5f)
            horizontalLineTo(21f)
            close()
            moveTo(13.995f, 10.695f)
            curveTo(13.331f, 10.695f, 12.804f, 10.873f, 12.413f, 11.227f)
            curveTo(12.023f, 11.582f, 11.827f, 12.063f, 11.827f, 12.668f)
            curveTo(11.827f, 13.016f, 11.916f, 13.326f, 12.093f, 13.598f)
            curveTo(12.271f, 13.87f, 12.512f, 14.084f, 12.818f, 14.24f)
            curveTo(12.454f, 14.403f, 12.171f, 14.636f, 11.969f, 14.939f)
            curveTo(11.767f, 15.241f, 11.666f, 15.583f, 11.666f, 15.964f)
            curveTo(11.666f, 16.586f, 11.878f, 17.08f, 12.303f, 17.448f)
            curveTo(12.728f, 17.816f, 13.294f, 18f, 14f, 18f)
            curveTo(14.703f, 18f, 15.266f, 17.817f, 15.689f, 17.451f)
            curveTo(16.113f, 17.084f, 16.324f, 16.589f, 16.324f, 15.964f)
            curveTo(16.324f, 15.586f, 16.224f, 15.248f, 16.024f, 14.948f)
            curveTo(15.824f, 14.649f, 15.538f, 14.413f, 15.167f, 14.24f)
            curveTo(15.476f, 14.084f, 15.72f, 13.87f, 15.899f, 13.598f)
            curveTo(16.079f, 13.326f, 16.168f, 13.016f, 16.168f, 12.668f)
            curveTo(16.168f, 12.063f, 15.973f, 11.582f, 15.582f, 11.227f)
            curveTo(15.191f, 10.873f, 14.662f, 10.695f, 13.995f, 10.695f)
            close()
            moveTo(10.22f, 10.769f)
            horizontalLineTo(10.068f)
            lineTo(7.295f, 11.789f)
            verticalLineTo(12.79f)
            lineTo(9.038f, 12.194f)
            verticalLineTo(17.902f)
            horizontalLineTo(10.22f)
            verticalLineTo(10.769f)
            close()
            moveTo(13.99f, 14.729f)
            curveTo(14.335f, 14.729f, 14.613f, 14.837f, 14.823f, 15.053f)
            curveTo(15.033f, 15.27f, 15.138f, 15.554f, 15.138f, 15.905f)
            curveTo(15.138f, 16.267f, 15.038f, 16.548f, 14.837f, 16.75f)
            curveTo(14.637f, 16.952f, 14.358f, 17.053f, 14f, 17.053f)
            curveTo(13.642f, 17.053f, 13.361f, 16.949f, 13.158f, 16.74f)
            curveTo(12.954f, 16.532f, 12.852f, 16.254f, 12.852f, 15.905f)
            curveTo(12.852f, 15.55f, 12.956f, 15.266f, 13.163f, 15.051f)
            curveTo(13.369f, 14.836f, 13.645f, 14.729f, 13.99f, 14.729f)
            close()
            moveTo(13.995f, 11.648f)
            curveTo(14.298f, 11.648f, 14.539f, 11.748f, 14.718f, 11.948f)
            curveTo(14.897f, 12.148f, 14.986f, 12.403f, 14.986f, 12.712f)
            curveTo(14.986f, 13.037f, 14.898f, 13.296f, 14.72f, 13.488f)
            curveTo(14.543f, 13.68f, 14.303f, 13.776f, 14f, 13.776f)
            curveTo(13.697f, 13.776f, 13.457f, 13.68f, 13.28f, 13.488f)
            curveTo(13.102f, 13.296f, 13.014f, 13.037f, 13.014f, 12.712f)
            curveTo(13.014f, 12.383f, 13.102f, 12.123f, 13.277f, 11.933f)
            curveTo(13.453f, 11.743f, 13.692f, 11.648f, 13.995f, 11.648f)
            close()
            moveTo(17.75f, 3f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(7f)
            horizontalLineTo(3f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(17.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CalendarDatePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CalendarDate, contentDescription = null)
    }
}
