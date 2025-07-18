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

public val FluentIcons.Filled.CloudFlow: ImageVector
    get() {
        if (_CloudFlow != null) {
            return _CloudFlow!!
        }
        _CloudFlow = ImageVector.Builder(
            name = "Filled.CloudFlow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 2f)
                curveTo(9.02f, 2f, 6.548f, 4.172f, 6.08f, 7.019f)
                curveTo(3.792f, 7.231f, 2f, 9.156f, 2f, 11.5f)
                curveTo(2f, 13.985f, 4.015f, 16f, 6.5f, 16f)
                horizontalLineTo(13.181f)
                lineTo(13.313f, 15.493f)
                curveTo(13.622f, 14.308f, 14.613f, 13.444f, 15.8f, 13.279f)
                curveTo(16.372f, 11.939f, 17.701f, 11f, 19.25f, 11f)
                curveTo(20.312f, 11f, 21.271f, 11.441f, 21.953f, 12.151f)
                curveTo(21.984f, 11.938f, 22f, 11.721f, 22f, 11.5f)
                curveTo(22f, 9.156f, 20.208f, 7.231f, 17.92f, 7.019f)
                curveTo(17.452f, 4.172f, 14.98f, 2f, 12f, 2f)
                close()
                moveTo(19.25f, 13.5f)
                curveTo(19.94f, 13.5f, 20.5f, 14.06f, 20.5f, 14.75f)
                curveTo(20.5f, 15.44f, 19.94f, 16f, 19.25f, 16f)
                curveTo(18.56f, 16f, 18f, 15.44f, 18f, 14.75f)
                curveTo(18f, 14.06f, 18.56f, 13.5f, 19.25f, 13.5f)
                close()
                moveTo(16.216f, 15.75f)
                horizontalLineTo(16.688f)
                curveTo(17.087f, 16.774f, 18.084f, 17.5f, 19.25f, 17.5f)
                curveTo(20.769f, 17.5f, 22f, 16.269f, 22f, 14.75f)
                curveTo(22f, 13.231f, 20.769f, 12f, 19.25f, 12f)
                curveTo(17.902f, 12f, 16.781f, 12.97f, 16.545f, 14.25f)
                horizontalLineTo(16.216f)
                curveTo(15.306f, 14.25f, 14.51f, 14.865f, 14.281f, 15.745f)
                lineTo(13.268f, 19.626f)
                curveTo(13.211f, 19.846f, 13.012f, 20f, 12.784f, 20f)
                horizontalLineTo(11.989f)
                curveTo(11.863f, 18.598f, 10.684f, 17.5f, 9.25f, 17.5f)
                curveTo(7.731f, 17.5f, 6.5f, 18.731f, 6.5f, 20.25f)
                curveTo(6.5f, 21.769f, 7.731f, 23f, 9.25f, 23f)
                curveTo(10.319f, 23f, 11.245f, 22.39f, 11.7f, 21.5f)
                horizontalLineTo(12.784f)
                curveTo(13.694f, 21.5f, 14.49f, 20.885f, 14.719f, 20.005f)
                lineTo(15.732f, 16.124f)
                curveTo(15.789f, 15.904f, 15.988f, 15.75f, 16.216f, 15.75f)
                close()
                moveTo(8f, 20.25f)
                curveTo(8f, 19.56f, 8.56f, 19f, 9.25f, 19f)
                curveTo(9.94f, 19f, 10.5f, 19.56f, 10.5f, 20.25f)
                curveTo(10.5f, 20.94f, 9.94f, 21.5f, 9.25f, 21.5f)
                curveTo(8.56f, 21.5f, 8f, 20.94f, 8f, 20.25f)
                close()
            }
        }.build()

        return _CloudFlow!!
    }

@Suppress("ObjectPropertyName")
private var _CloudFlow: ImageVector? = null

@Preview
@Composable
private fun CloudFlowPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CloudFlow, contentDescription = null)
    }
}
